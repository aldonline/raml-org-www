package org.raml.www.html

import org.raml.www.util.MarkdownUtils

object page_docs extends HtmlBase {

  def apply() = {

    val aside = <aside>
      <nav>
        <h1>Documentation</h1>
        <ul>
          <li>
            <a href="#step-introduction">RAML 100 Tutorial</a>
          </li>
          <li>
            <a href="#enter-the-root">Step 1: Enter the Root</a>
          </li>
          <li>
            <a href="#enter-resources">Step 2: Enter Resources</a>
          </li>
          <li>
            <a href="#enter-methods">Step 3: Enter Methods</a>
          </li>
          <li>
            <a href="#enter-uri-parameters">Step 4: Enter URI Parameters</a>
          </li>
          <li>
            <a href="#enter-query-parameters">Step 5: Enter Query Parameters</a>
          </li>
          <li>
            <a href="#enter-responses">Step 6: Enter Responses</a>
          </li>
        </ul>
        <ul class="nav-tutorials">
          <li>
            <a href="docs-200">RAML 200 Tutorial</a>
          </li>
        </ul>
        <a id="cta-github" href="spec" target="_blank">Read the RAML Spec</a>
      </nav>
    </aside>

    val content = <div class="content">
      <h2 id="step-introduction">RAML 100 tutorial</h2>
      <div class="tutorial-intro">
        {MarkdownUtils.mdFromResource("/md/100tutorial-pre.md")}
      </div>
      {MarkdownUtils.mdFromResource("/md/100tutorial.md")}
    </div>

    Seq( aside, content )

  }


}
