package org.raml.www.data

import org.raml.www.util.MarkdownUtils

import scala.xml.XML

case class MemberData( name: String, role: String, company: String, linkedin: String, twitter: String, image: String, img_class: String  )
case class WebsiteData( workgroup: Seq[MemberData], stories: Seq[StoryData], quotes: Seq[QuoteData] )
case class StoryData( id: String, title: Option[String], content: Option[String] )
case class QuoteData( id: String, story:Option[String], content: Option[String], author_name: Option[String], author_role: Option[String], author_company: Option[String] )

object WebsiteData {
  def fetch = {
    import com.novus.salat._
    import com.novus.salat.global.ctx
    val jsonUrl = "https://drive.google.com/uc?export=download&id=0B6knqCd0DIdfRTRQQ1BHUGt3RzQ"
    val jsonStr = io.Source.fromURL(jsonUrl, "UTF-8").mkString
    grater[WebsiteData] fromJSON jsonStr
  }
  private var cached: Option[WebsiteData] = None
  def get: Website = synchronized {
    if ( cached.isEmpty ) cached = Some(WebsiteData.fetch);
    new Website( cached.get )
  }

  def reset() = synchronized { cached = None }

  private def stropt( str: String ): Option[String] = if ( str.trim.isEmpty ) None else Some(str)
  private def stropt( str: Option[String] ): Option[String] = str match {
    case None => None
    case Some(str) => stropt( str )
  }


  class Website( data: WebsiteData ) {
    lazy val workgroup_members = data.workgroup.map(new Member(_))
    lazy val stories = data.stories.map(new Story(_ , this))
    lazy val quotes = data.quotes.map(new Quote(_, this))
    lazy val featuredQuotes = quotes.filter( _.name.nonEmpty ) // filter by length too?
    def storyById( id: String ): Option[Story] = stories.find( _.id == id )
    def quoteById( id: String ): Option[Quote] = quotes.find( _.id == id )
  }

  class Member( data: MemberData ){
    lazy val name      = data.name
    lazy val role      = data.role
    lazy val company   = data.company
    lazy val image     = data.image
    lazy val linkedin  = stropt(data.linkedin)
    lazy val twitter   = stropt(data.twitter)
    lazy val img_class = stropt(data.img_class)
  }

  class Story ( data: StoryData, private val website: Website ){
    lazy val id        = data.id
    lazy val content   = stropt( data.content )
    lazy val html      = content.map( MarkdownUtils.mdFromString( _ ))
    lazy val title     = stropt( data.title )
    lazy val quotes    = website.quotes.filter( x => { x.story.isDefined && x.story.get == this } )
  }

  class Quote( data: QuoteData, private val website: Website ){

    lazy val id      = data.id
    lazy val content = stropt( data.content )
    lazy val html    = content.map( MarkdownUtils.mdFromString( _ ))
    lazy val name    = stropt( data.author_name )
    lazy val role    = stropt( data.author_role )
    lazy val company = stropt( data.author_company )
    lazy val story: Option[Story] = data.story.flatMap( website.storyById( _ ) )
    lazy val blockquoteHTML = <blockquote> {html.getOrElse(Nil)} {citeHTML} </blockquote>

    private def inspan( v: Option[String], cssClassName: String ) = v.map( x => <span class={cssClassName}>{ x }</span>) getOrElse Nil
    lazy val citeHTML = <cite>
      {inspan( name, "author_name" ) }
      {inspan( role, "author_role" ) }
      {inspan( company, "author_company" ) }
    </cite>
  }

}
