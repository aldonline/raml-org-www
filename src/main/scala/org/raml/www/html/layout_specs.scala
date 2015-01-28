package org.raml.www.html

import scala.xml.NodeSeq

object layout_specs extends HtmlBase {
  def apply( content: NodeSeq, current_page: Option[String] = None ) = {
    <html lang="en">
      <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <meta charset="utf-8"/>
        <title>RAML 0.8 Specification</title>
        { css("stylesheets/github-37b6e181a972ce6706fa61ad91a3f4994af90049.css",
        "stylesheets/github2-8159a6c9a2c0054ae5779d7c98fa8d0b5dd25fca.css") }
        { css(codemirror_css : _*) }
        { inline_css(".previewPage { margin: 64px auto; width: 920px; }") }
        { js("https://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js") }
        { js("v2/out/main.js") }
        { js(codemirror_js : _*) }
      </head>
      <body cz-shortcut-listen="true">
        <div class="page">
          <div class="previewPage">
            <div id="readme" class="announce md">
              <article class="markdown-body entry-content">
                {content}
              </article>
            </div>
          </div>
          <div>&nbsp;</div>
        </div>
      </body>
    </html>
  }
}
