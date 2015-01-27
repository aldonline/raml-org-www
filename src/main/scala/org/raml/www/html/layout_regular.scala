package org.raml.www.html

import scala.xml.NodeSeq

object layout_regular extends HtmlBase {
  def apply( content: NodeSeq, current_page: Option[String] = None ) = {
    layout_default(
      <div class="content-wrapper-pages">
        <section>{content}</section>
      </div>, current_page
    )
  }
}
