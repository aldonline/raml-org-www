package org.raml.www.html

import scala.xml.NodeSeq

object layout_default extends HtmlBase {

  private lazy val google_analytics_js = """(function(i,s,o,g,r,a,m){i['GoogleAnalyticsObject']=r;i[r]=i[r]||function(){
      (i[r].q=i[r].q||[]).push(arguments)},i[r].l=1*new Date();a=s.createElement(o),
    m=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m)
    })(window,document,'script','//www.google-analytics.com/analytics.js','ga');
    ga('create', 'UA-44483523-1', 'raml.org');
    ga('send', 'pageview');"""


  def apply( content: NodeSeq, current_page: Option[String] = None ) = {
    def header = {

      def active_if( urls: String* ) = if ( urls.contains(current_page.getOrElse("xxx")) ) "active" else ""

      <header>
        <nav>
          <ul>
            <li class="nav-logo">
              <a href="/">RAML</a>
            </li>
            <li class="nav-projects">
              <a class={active_if("projects","in-the-wild")}  href="/projects">Projects</a>
            </li>
            <li class="nav-docs">
              <a class={active_if("docs","docs-200")} href="/docs">Documentation</a>
            </li>
            <li class="nav-forum">
              <a href="http://forums.raml.org/">Forum</a>
            </li>
            <li class="nav-blog">
              <a href="http://blog.raml.org/">Blog</a>
            </li>
            <li class="nav-about">
              <a class={active_if("about","licensing", "branding")} href="/about">About</a>
            </li>
          </ul>
        </nav>
      </header>

    }

    def header_mobile = {
      <header class="header-mobile">
        <a class="nav-logo" href="/">RAML</a>
        <nav>
          <ul>
            <li class="nav-projects">
              <a href="projects">Projects</a>
            </li>
            <li class="nav-docs">
              <a href="docs">Documentation</a>
            </li>
            <li class="nav-forum">
              <a href="http://forums.raml.org/">Forum</a>
            </li>
            <li class="nav-blog">
              <a href="http://blog.raml.org/">Blog</a>
            </li>
            <li class="nav-about">
              <a href="about">About</a>
            </li>
          </ul>
        </nav>
      </header>
    }

    def footer = {
      <div class="footer-wrapper">
        <section class="footer">
          {signup_div}
          <div class="footer-nav">
            <a href="about#about-workgroup">RAML Workgroup</a>
            <a href="mailto:info@raml.org">Contact</a>
            <a href="licensing">Licensing</a>
          </div>
        </section>
      </div>
    }


    def signup_div = {
      val google_docs_form_url  = "https://docs.google.com/a/mulesoft.com/forms/d/1n3XKLpqIU9yg5635jD33LQBT2Jo4xqUsmSGrU-nKmGs/formResponse"
      <div class="signup">
        <iframe name="signup-form" style="display:none" src={google_docs_form_url}></iframe>
        <form action={google_docs_form_url} method="POST" id="ss-form" onsubmit="" target="signup-form">
          <label>Subscribe and learn about new RAML projects</label>
          <input type="text" name="entry.1586103239" value="" class="ss-q-short valid" placeholder="Email Address" id="entry_1586103239" dir="auto" title=""/>
          <input type="submit" name="submit" value="Subscribe" id="ss-submit"/>
        </form>
        <div id="ss-form-response" style="display:none">Thanks for signing up!</div>
      </div>
    }


    <html lang="en">
      <head>
        <meta charset="utf-8" />
        <meta name="viewport" content="width=device-width" />
        <title>RAML - RESTful API modeling language</title>
        {css(
          "stylesheets/normalize.css",
          "stylesheets/pygments.css",
          "stylesheets/screen.css",
          "javascripts/source/jquery.fancybox.css?v=2.1.5"
        )}
        {css(codemirror_css : _*)}
        {js("https://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js")}
      </head>
      <body id="home">

        <div class="header-wrapper">
          {header}
          {header_mobile}
          <a class="github-callout symbol" href="https://github.com/raml-org/raml-spec" title="GitHub"></a>
        </div>
        {content}
        {footer}

        {js(
        "javascripts/retina-1.1.0.min.js",
        "javascripts/source/jquery.fancybox.pack.js?v=2.1.5",
        "javascripts/source/helpers/jquery.fancybox-media.js?v=1.0.6",
        "javascripts/jquery.scrollTo.min.js",
        "javascripts/waypoints.min.js",
        "javascripts/jquery.clipboard.js",
        "javascripts/custom.js",
        "v2/out/main.js"
      )}
        {js(codemirror_js : _*)}
        {inline_js(s""" window.current_page = "${current_page.getOrElse("xxx")}" """)}
        {inline_js("""  $(".cta-video").fancybox() """)}
        {inline_js(
        """
          |var $buoop = {};
          |        $buoop.ol = window.onload;
          |        window.onload=function(){
          |        try {if ($buoop.ol) $buoop.ol();}catch (e) {}
          |        var e = document.createElement("script");
          |        e.setAttribute("type", "text/javascript");
          |        e.setAttribute("src", "//browser-update.org/update.js");
          |        document.body.appendChild(e);
          |        }
        """.stripMargin)}

        {inline_js(google_analytics_js)}
      </body>
    </html>

  }


}
