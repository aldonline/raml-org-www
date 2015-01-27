package org.raml.www.html

import org.raml.www.util.MarkdownUtils

object page_docs_200 extends HtmlBase {

  def apply(): scala.xml.Node = {

    <div>
      <aside>
        <nav>
          <h1>Documentation</h1>
          <ul class="nav-tutorials">
            <li>
              <a href="docs">RAML 100 Tutorial</a>
            </li>
          </ul>
          <ul>
            <li>
              <a href="#step-introduction">RAML 200 Tutorial</a>
            </li>
            <li>
              <a href="#setting-up-the-workspace">Setting up the workspace</a>
            </li>
            <li>
              <a href="#use-case">Use case description</a>
            </li>
            <li>
              <a href="#base-raml-file">Step 0: Base RAML file</a>
            </li>
            <li>
              <a href="#body-parameters">Step 1: Body Parameters</a>
            </li>
            <li>
              <a href="#extract-schemas">Step 2: Extract Schemas</a>
            </li>
            <li>
              <a href="#resource-types">Step 3: Resource Types</a>
            </li>
            <li>
              <a href="#parameters">Step 4: Parameters</a>
            </li>
            <li>
              <a href="#includes">Step 5: Includes</a>
            </li>
            <li>
              <a href="#refactor">Step 6: Refactor</a>
            </li>
            <li>
              <a href="#traits">Step 7: Traits</a>
            </li>
            <li>
              <a href="#final-tuning">Step 8: Final Tuning</a>
            </li>
            <li>
              <a href="#conclusion">Conclusion</a>
            </li>
          </ul>
          <a id="cta-github" href="spec" target="_blank">Read the RAML Spec</a>

        </nav>
      </aside>
      <div class="content">
        <h2 id="step-introduction">RAML 200 tutorial</h2>
        <div class="tutorial-intro">
          {MarkdownUtils.mdFromResource("/md/200tutorial-pre.md")}
        </div>
        {MarkdownUtils.mdFromResource("/md/200tutorial.md")}
      </div>
    </div>

  }

}
