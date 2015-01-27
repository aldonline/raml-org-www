package org.raml.www.html

import org.raml.www.data.WebsiteData

import scala.xml._

object page_home extends HtmlBase {

  private def raml_code_xml = {
    val code = """<pre><div class="line"><span class="l1">#&#37;RAML 0.8</span></div><div class="line"> </div><div class="line"><span class="def">title:</span> <span class="val">World Music API</span></div><div class="line"><span class="def">baseUri:</span> <span class="val">http://example.api.com/{version}</span></div><div class="line"><span class="def">version:</span> <span class="val">v1</span></div><div class="line"><span class="l2">traits:</span></div><div class="line"><span class="l22">  - paged:</span></div><div class="line"><span class="l22">      queryParameters:</span></div><div class="line"><span class="l22">        pages:</span></div><div class="line"><span class="l22">          description:</span> <span class="val">The number of pages to return</span></div><div class="line"><span class="l22">          type:</span> <span class="val">number</span></div><div class="line"><span class="l22">  - secured:</span> <span class="val">!include http://raml-example.com/secured.yml</span></div><div class="line"><span class="l3">/songs:</span></div><div class="line"><span class="def">  is:</span> <span class="val">[ paged, secured ]</span></div><div class="line"><span class="l4">  get:</span></div><div class="line"><span class="l5">    queryParameters:</span></div><div class="line"><span class="l5">      genre:</span></div><div class="line"><span class="l5">        description:</span> <span class="val">filter the songs by genre</span></div><div class="line"><span class="l4">  post:</span></div><div class="line"><span class="l3">  /{songId}:</span></div><div class="line"><span class="l4">    get:</span></div><div class="line"><span class="l5">      responses:</span></div><div class="line"><span class="l5">        200:</span></div><div class="line"><span class="l5">          body:</span></div><div class="line"><span class="l5">            application/json:</span></div><div class="line"><span class="l5">              schema:</span> <span class="l1">|</span></div><div class="line"><span class="l1">                { "$schema": "http://json-schema.org/schema",</span></div><div class="line"><span class="l1">                  "type": "object",</span></div><div class="line"><span class="l1">                  "description": "A canonical song",</span></div><div class="line"><span class="l1">                  "properties": {</span></div><div class="line"><span class="l1">                    "title":  { "type": "string" },</span></div><div class="line"><span class="l1">                    "artist": { "type": "string" }</span></div><div class="line"><span class="l1">                  },</span></div><div class="line"><span class="l1">                  "required": [ "title", "artist" ]</span></div><div class="line"><span class="l1">                }</span></div><div class="line"><span class="l5">            application/xml:</span></div><div class="line"><span class="l4">    delete:</span></div><div class="line"><span class="l5">      description: |</span></div><div class="line"><span class="val">        This method will <span class="u">*delete*</span> an <span class="def">**individual song**</span></span></div></pre>"""
    XML.loadString(code)
  }

  def apply() = {

    def line_numbers = ( 1 to 39 ).map({ i => <span class="line-number">{i}</span> :: Text(" ") :: Nil }).flatten

    def code_table = {
      <table cellpadding="0" cellspacing="0" class="example-snippet">
        <tr>
          <td class="line-numbers">{line_numbers}</td>
          <td class="line-code">{raml_code_xml}</td>
        </tr>
      </table>
    }

    Seq(
      <div class="banner-wrapper">
        <div class="content">
          <section class="banner">
            <h1>RESTful API Modeling Language</h1>
            <h2>RESTful API Modeling Language (RAML) is a simple and succinct way of describing practically-RESTful APIs. It encourages reuse, enables discovery and pattern-sharing, and aims for merit-based emergence of best practices. The goal is to help our current API ecosystem by solving immediate problems and then encourage ever-better API patterns. RAML is built on broadly-used standards such as YAML and JSON and is a non-proprietary, vendor-neutral open spec.</h2>
            <a id="cta-github" href="spec" target="_blank">Read the RAML Spec</a>
          </section>
          <div class="cta">
            <a class="cta-video fancybox.iframe" href="http://www.youtube.com/embed/5o_nExedezw?autoplay=1"></a>
          </div>
        </div>
      </div>
      ,

      <div class="content-wrapper">
        <div class="content">
          <section class="callouts">
            <p class="callout1">For every API, start by defining which version of RAML you are using, and then document <a href="https://github.com/raml-org/raml-spec/blob/master/raml-0.8.md#basic-information" target="_blank">basic characteristics</a> of your API - the title, version, and baseURI.<i></i></p>
            <p class="callout2">RAML allows you to define patterns using <a href="https://github.com/raml-org/raml-spec/blob/master/raml-0.8.md#resource-types-and-traits" target="_blank">traits</a>, <a href="https://github.com/raml-org/raml-spec/blob/master/raml-0.8.md#resource-types-and-traits" target="_blank">resourceTypes</a>, and <a href="https://github.com/raml-org/raml-spec/blob/master/raml-0.8.md#security" target="_blank">securitySchemes</a>, and then use them within a API to minimize repetition.<i></i></p>
            <p class="callout3">Externalize those patterns, store them on the web, and import them with an <a href="https://github.com/raml-org/raml-spec/blob/master/raml-0.8.md#includes" target="_blank">!include</a>.<i></i></p>
            <p class="callout4">Easily define <a href="https://github.com/raml-org/raml-spec/blob/master/raml-0.8.md#resources-and-nested-resources" target="_blank">resources and methods</a>, then add as much detail as you want. Apply traits and other patterns, or add <a href="https://github.com/raml-org/raml-spec/blob/master/raml-0.8.md#named-parameters" target="_blank">parameters</a> and other details specific to each call.<i></i></p>
            <p class="callout5">Describe expected <a href="https://github.com/raml-org/raml-spec/blob/master/raml-0.8.md#schema" target="_blank">responses</a> for multiple mime-types and specify <a href="https://github.com/raml-org/raml-spec/blob/master/raml-0.8.md#schema" target="_blank">schemas and examples</a> for each one. Schemas and examples can be defined in-line, or externalized with !include.<i></i></p>
            <p class="callout6">Write human-readable, markdown-formatted descriptions throughout your RAML spec, or include entire <a href="https://github.com/raml-org/raml-spec/blob/master/raml-0.8.md#user-documentation" target="_blank">markdown documentation</a> sections at the root.<i></i></p>
          </section>
          <section class="brackets">
            {(1 to 6) map { i =>
            <div class={s"bracket bracket$i"}>
              <span class="top"></span>
              <span class="bottom"></span>
            </div>
          }}
          </section>
          {code_table}
        </div>
      </div>
    ,
      <div class="quote-carroussel-wrapper">
        <div class="content">
          { WebsiteData.get.featuredQuotes.map( _.blockquoteHTML ) }
          { /*WebsiteData.get.featuredQuotes.head.blockquoteHTML*/ }
        </div>
      </div>

    )
  }
}
