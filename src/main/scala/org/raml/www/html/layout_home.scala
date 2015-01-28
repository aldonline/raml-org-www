package org.raml.www.html

import scala.xml.NodeSeq

object layout_home extends HtmlBase {
  def apply( content: NodeSeq, current_page: Option[String] = None ) = layout_default( content , current_page )
}