package org.raml.www.util

import java.io.InputStreamReader
import javax.script.{Invocable, ScriptEngineManager}

import scala.xml.transform.{RewriteRule, RuleTransformer}
import scala.xml.{Elem, Node, NodeSeq}

object MarkdownUtils {

  def process( str: String ) = engine.asInstanceOf[Invocable].invokeFunction("marked", str ).asInstanceOf[String];

  def mdFromString( text: String ) = {
    import scala.xml._
    val html = MarkdownUtils.process(text)
      .replaceAllLiterally("<br>", "<br/>")
      .replaceAllLiterally("<tokenName>", "&lt;tokeName&gt;")
    val node: Elem = XML.loadString("<div>" + html + "</div>")
    val node2 = xmltransform(node)
    node2.nonEmptyChildren
  }

  def mdFromResource( url: String ): NodeSeq = this mdFromString io.Source.fromInputStream(getClass.getResourceAsStream(url)).mkString

  private lazy val xmltransform = {
    new RuleTransformer( new RewriteRule {
      override def transform(n: Node): Seq[Node] = n match {
        case Elem(prefix, "h2", attribs, scope, _*) =>
          <h2 id={n.text.split(" ").mkString("-").toLowerCase}>{n.text}</h2>
        case other => other
      }
    })
  }

  private lazy val engine = {
    val e = new ScriptEngineManager().getEngineByName("JavaScript");
    e.eval( new InputStreamReader( getClass.getResourceAsStream("/marked.min.js") ) );
    e.eval( new InputStreamReader( getClass.getResourceAsStream("/marked2.js") ) );
    e
  }

}
