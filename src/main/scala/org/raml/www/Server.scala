package org.raml.www

import java.io.{File}

import akka.actor.ActorSystem
import org.raml.www.data.WebsiteData
import org.raml.www.util.MarkdownUtils
import spray.http.{StatusCodes, HttpEntity, MediaTypes}
import spray.routing.SimpleRoutingApp

import scala.util.Properties

class WebsiteInstance {
  import org.raml.www.html._
  lazy val index         = layout_home( page_home() )
  lazy val in_the_wild   = layout_regular( page_in_the_wild(), Some("in-the-wild") )
  lazy val licensing     = layout_regular( page_licensing(), Some("licensing") )
  lazy val docs_200      = layout_regular( page_docs_200(), Some("docs-200") )
  lazy val about         = layout_regular( page_about(), Some("about") )
  lazy val branding      = layout_regular( page_branding(), Some("branding") )
  lazy val docs          = layout_regular( page_docs(), Some("docs") )
  lazy val projects      = layout_regular( page_projects(), Some("projects") )
  lazy val spec          = layout_specs( MarkdownUtils.mdFromResource("/md/spec.md") )
}

object WebsiteInstance {
  private var cached: Option[WebsiteInstance] = None
  def get: WebsiteInstance = synchronized {
    if ( cached.isEmpty ) cached = Some( new WebsiteInstance )
    cached.get
  }
  def reset() = synchronized { cached = None }
}

object Server extends SimpleRoutingApp {

  implicit val actorSystem = ActorSystem()
  lazy val publicDirPath = new File( new File("."), "public").getCanonicalPath + "/"
  private def xml2htmlentity( xml: scala.xml.Node ) = HttpEntity( MediaTypes.`text/html`, "<!DOCTYPE html>\n" + xml.toString )

  def website = WebsiteInstance.get

  def main2(args: Array[String]): Unit = {
    val port = Properties.envOrElse("PORT", "8080").toInt
    startServer("0.0.0.0", port = port){
      get {
        pathSingleSlash { complete{ "Hello World" } }
      }
    }
  }

  def main(args: Array[String]): Unit = {
    def setupPage( str: String, content: scala.xml.Node ) =
      path( str ) { complete{ xml2htmlentity( content ) } } ~
        path( str + ".html" ) { redirect(str, StatusCodes.PermanentRedirect) } ;
    val port = Properties.envOrElse("PORT", "8080").toInt
    startServer("0.0.0.0", port = port){
      get {
        pathSingleSlash { complete{ xml2htmlentity( website.index ) } } ~
        path("index.html") { redirect("/", StatusCodes.PermanentRedirect) } ~
        setupPage("about", website.about ) ~
        setupPage("branding", website.branding ) ~
        setupPage("docs", website.docs ) ~
        setupPage("docs-200", website.docs_200 ) ~
        setupPage("in-the-wild", website.in_the_wild ) ~
        setupPage("licensing", website.licensing ) ~
        setupPage("projects", website.projects ) ~
        setupPage("spec", website.spec ) ~
          path("reset") {
            WebsiteInstance.reset()
            complete { "data was reset" }
          } ~
          getFromDirectory( publicDirPath )
      }
    }
  }
}