package org.raml.www.html

trait HtmlBase {
  implicit class UnparsedStringX( val x: String ){
    def u = scala.xml.Unparsed( x )
  }
  def inline_css( str: String ) = <style>{ str.u }</style>
  def inline_js( str: String )  = <script>{ str.u }</script>
  def js( urls: String* )         = urls.map { url => <script src={ url }> </script> }
  def css( urls: String* )        = urls.map { url => <link rel="stylesheet" href={ url }/> }
}
