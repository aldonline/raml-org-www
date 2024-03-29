package org.raml.www.html

object page_projects extends HtmlBase {

  def apply() = {

    <div id="section-projects">
      <div class="projects-subnav">
        <ul>
          <li><a href="#usage">Who's using RAML?</a></li>
          <li><a href="#tools" class="active">Tools</a></li>
        </ul>
      </div>
      <section id="section-tools">
        <div id="section-core">
          <div id="projects-core-header"><h2>Core</h2></div>
          <ul class="projects-source">
            <li data-tags="owner:raml-workgroup, status:stable, team:core, role:api-architect, role:developer">
              <div class="project-title">
                <div class="icon"></div>
                <h3><a href="#tools-raml-spec" class="anchor"><span></span></a>RAML Spec</h3>
                <h4>Developed by the RAML workgroup</h4>
                <a href="https://github.com/raml-org/raml-spec" class="project-github" target="_blank">View on Github</a>
                <a href="spec.html" class="project-html" target="_blank">View as HTML</a>
              </div>
              <div class="project-description">
                <p>The RESTful API Modeling Language (RAML) is a concise, expressive language for describing RESTful APIs.
                  Built on broadly used standards such as YAML and JSON, RAML is a non-proprietary, vendor-neutral open spec.</p>
              </div>
            </li>
            <li>
              <div class="project-title">
                <div class="icon"></div>
                <h3><a href="#tools-raml-javascript-parser" class="anchor"><span></span></a>RAML JavaScript Parser</h3>
                <h4>Contributed to the RAML workgroup by Mulesoft</h4>
                <h4><i>License: Apache 2</i></h4>
                <p>Stable</p>
                <a href="https://github.com/raml-org/raml-js-parser" class="project-github" target="_blank">View on Github</a>
              </div>
              <div class="project-description">
                <p>A reference implementation of a RAML parser for JavaScript.
                  The parser is based on PyYAML, written in CoffeeScript, and can be used as a node.js module or in-browser.
                  Compliant with RAML 0.8.</p>
              </div>
            </li>
            <li>
              <div class="project-title">
                <div class="icon"></div>
                <h3><a href="#tools-raml-java-parser" class="anchor"><span></span></a>RAML Java Parser</h3>
                <h4>Contributed to the RAML workgroup by Mulesoft</h4>
                <h4><i>License: Apache 2</i></h4>
                <p>Stable</p>
                <a href="https://github.com/raml-org/raml-java-parser" class="project-github" target="_blank">View on Github</a>
              </div>
              <div class="project-description">
                <p>A reference implementation of a RAML parser for Java.
                  The parser is based on SnakeYAML, and written in Java.
                  It can be added as a Java library either into a project directly or through Apache Maven.
                  Compliant with RAML 0.8.</p>
              </div>
            </li>
            <li>
              <div class="project-title">
                <div class="icon"></div>
                <h3><a href="#tools-pyraml-parser" class="anchor"><span></span></a>pyraml-parser</h3>
                <h4>Developed by an2deg</h4>
                <h4><i>License: MIT</i></h4>
                <p>Early Release</p>
                <a href="https://github.com/an2deg/pyraml-parser" class="project-github" target="_blank">View on Github</a>
              </div>
              <div class="project-description">
                <p>A reference implementation of a RAML parser for Python.
                  It's based on PyYAML and written in Python.
                  Compliant with RAML 0.8.</p>
              </div>
            </li>
            <li>
              <div class="project-title">
                <div class="icon"></div>
                <h3><a href="#tools-raml-ruby" class="anchor"><span></span></a>RAML Ruby</h3>
                <h4>Developed by kgorin @ coub</h4>
                <h4><i>License: MIT</i></h4>
                <p>Early Release</p>
                <a href="https://github.com/coub/raml_ruby" class="project-github" target="_blank">View on Github</a>
              </div>
              <div class="project-description">
                <p>A reference implementation of a RAML parser in Ruby.
                  It uses Psych YAML parser and is written in Ruby.
                  Compliant with RAML 0.8.</p>
              </div>
            </li>
            <li>
              <div class="project-title">
                <div class="icon"></div>
                <h3><a href="#tools-php-raml-parser" class="anchor"><span></span></a>PHP RAML Parser</h3>
                <h4>Developed by alecsammon</h4>
                <h4><i>License: MIT</i></h4>
                <p>Early Release</p>
                <a href="https://github.com/alecsammon/php-raml-parser" class="project-github" target="_blank">View on Github</a>
              </div>
              <div class="project-description">
                <p>A reference implementation of a RAML parser in PHP.
                  Compliant with RAML 0.8.</p>
              </div>
            </li>
          </ul>
        </div> <!-- // #section-core -->



        <ul class="projects-projects">
          <li>
            <div class="project-title">
              <div class="icon"></div>
              <h3><a href="#tools-api-designer" class="anchor"><span></span></a>API Designer</h3>
              <h4>Developed by MuleSoft</h4>
              <h4><i>License: CPAL-1.0</i></h4>
              <p>Stable</p>
              <a href="https://github.com/mulesoft/api-designer" class="project-github" target="_blank">View on Github</a>
              <button id="test-cta" class="project-html">Try it out</button>
            </div>
            <div class="project-description">
              <p>API Designer is a web-based API development tool that allows API providers to
                design their API quickly, efficiently, and consistently, and
                socialize the design. It consists of a RAML editor side-by-side with an embedded
                RAML console (the API Console).</p>
            </div>
            <div class="project-steps">
              <h5>Steps to try it out</h5>
              <ol>
                <li><p>Go to <a href="https://anypoint.mulesoft.com/apiplatform/" target="_blank">Anypoint Platform</a></p></li>
                <li><p>Log in (or Sign Up if you don't have an account yet)</p></li>
                <li><p>Add an API</p></li>
                <li><p>Under RAML Definition, click "Define API in API Designer"</p></li>
              </ol>
            </div>
          </li>
          <li>
            <div class="project-title">
              <div class="icon"></div>
              <h3><a href="#tools-api-console" class="anchor"><span></span></a>API Console</h3>
              <h4>Developed by MuleSoft</h4>
              <h4><i>License: CPAL-1.0</i></h4>
              <p>Stable</p>
              <a href="https://github.com/mulesoft/api-console" class="project-github" target="_blank">View on Github</a>
              <button id="test-cta" class="project-html">Try it out</button>
            </div>
            <div class="project-description">
              <p>API Console is a graphical user interface for a RAML-defined API that visually
                exposes the API’s structure and important patterns and serves as interactive API documentation.</p>
            </div>
            <div class="project-steps">
              <h5>See RAML in action through API Console on these developer portals:</h5>
              <ul>
                <li><p><a href="https://anypoint.mulesoft.com/apiplatform/popular/#/portals/apis/6308/versions/6302/pages/5665" target="_blank">Twitter API Portal</a></p></li>
                <li><p><a href="https://anypoint.mulesoft.com/apiplatform/popular/#/portals/apis/5502/versions/5487/pages/4477" target="_blank">Twilio API Portal</a></p></li>
                <li><p><a href="https://anypoint.mulesoft.com/apiplatform/popular/#/portals/apis/7022/versions/7061/pages/5679" target="_blank">GitHub API Portal</a></p></li>
              </ul>
            </div>
          </li>
          <li>
            <div class="project-title">
              <div class="icon"></div>
              <h3><a href="#tools-api-notebook" class="anchor"><span></span></a>API Notebook</h3>
              <h4>Developed by MuleSoft</h4>
              <h4><i>License: CPAL-1.0</i></h4>
              <p>Stable</p>
              <a href="https://github.com/mulesoft/api-notebook" class="project-github" target="_blank">View on Github</a>
              <a href="http://apinotebook.com" class="project-html" target="_blank">Try it out</a>
            </div>
            <div class="project-description">
              <p>API Notebook is a web-based, persistent, JavaScript scripting workspace that enables live testing and exploring of APIs, and saving API use cases as markdown gists, so they are versioned, forkable and shareable. It's an example of <a href="https://en.wikipedia.org/wiki/Literate_programming" target="_blank">literate programming</a>.</p>
            </div>
          </li>
          <li>
            <div class="project-title">
              <div class="icon"></div>
              <h3><a href="#tools-soapui-raml-plugin" class="anchor"><span></span></a>SoapUI RAML Plugin</h3>
              <h4>Developed by SmartBear / Ole Lensmar</h4>
              <h4><i>License: Apache 2</i></h4>
              <p>Stable</p>
              <a href="https://github.com/olensmar/soapui-raml-plugin" class="project-github" target="_blank">View on Github</a>
              <a href="http://olensmar.blogspot.se/2013/12/a-raml-apihub-plugin-for-soapui.html" class="project-html" target="_blank">Try it out</a>
            </div>
            <div class="project-description">
              <p><a href="http://www.soapui.org/" target="SoapUI">SoapUI</a> is a very popular functional testing tool,
                broadly used for testing any HTTP APIs including both SOAP and REST, as well as JMS, AMF,
                and JDBC. The RAML plugin for SoapUI allows the importing of RAML APIs into SoapUI for testing.
              </p>
            </div>
          </li>
          <li>
            <div class="project-title">
              <div class="icon"></div>
              <h3><a href="#tools-apikit-1.0" class="anchor"><span></span></a>APIkit 1.0</h3>
              <h4>Developed by MuleSoft</h4>
              <h4><i>License: CPAL-1.0</i></h4>
              <p>Stable</p>
              <a href="https://github.com/mulesoft/apikit" class="project-github" target="_blank">View on Github</a>
              <a href="http://www.mulesoft.org/documentation/display/current/APIkit" class="project-html" target="_blank">Try it out</a>
            </div>
            <div class="project-description">
              <p>APIkit is a declarative toolkit that leverages RAML to facilitate the implementation of APIs.
                It uses RAML as the definition of the API, which can then be used with APIkit Maven- and Mule Studio-based
                tools for mocking the interface and implementing its backend using Mule flows.</p>
            </div>
          </li>
          <li>
            <div class="project-title">
              <div class="icon"></div>
              <h3><a href="#tools-raml-store" class="anchor"><span></span></a>RAML Store</h3>
              <h4>Developed by brianmc</h4>
              <h4><i>License: Apache 2</i></h4>
              <p>Stable</p>
              <a href="https://github.com/brianmc/raml-store" class="project-github" target="_blank">View on Github</a>
            </div>
            <div class="project-description">
              <p>RAML Store provides a simple storage API plus a persistence plugin which enables you to run
                the RAML API Designer locally (rather than using a cloud service) and still be able to manage
                and collaborate on your design. The service is built with node.js, using express and mongodb.</p>
            </div>
          </li>
          <li>
            <div class="project-title">
              <div class="icon"></div>
              <h3><a href="#tools-raml-for-jax-rs" class="anchor"><span></span></a>RAML for JAX-RS</h3>
              <h4>Developed by MuleSoft</h4>
              <h4><i>License: Apache 2</i></h4>
              <p>Early Release</p>
              <a href="https://github.com/mulesoft/raml-for-jax-rs" class="project-github" target="_blank">View on Github</a>
            </div>
            <div class="project-description">
              <p>The goal of RAML for JAX-RS is to provide a set of tools to work with these technologies in a way of being able
                to scaffold a JAVA + JAX-RS application based on an existing RAML API definition (Code Generation), or its roundtrip,
                generate the RAML API definition based on an existing JAVA + JAX-RS application (Documentation).
              </p>
            </div>
          </li>
          <li>
            <div class="project-title">
              <div class="icon"></div>
              <h3><a href="#tools-raml-sublime-plugin" class="anchor"><span></span></a>RAML Sublime Plugin</h3>
              <h4>Developed by MuleSoft</h4>
              <h4><i>License: Apache 2</i></h4>
              <p>Stable</p>
              <a href="https://github.com/mulesoft/raml-sublime-plugin" class="project-github" target="_blank">View on Github</a>
            </div>
            <div class="project-description">
              <p>RAML Sublime Plugin is a syntax highlighter for Sublime (the popular text editor).
              </p>
            </div>
          </li>
          <li>
            <div class="project-title">
              <div class="icon"></div>
              <h3><a href="#tools-raml-to-html" class="anchor"><span></span></a>RAML to HTML</h3>
              <h4>Developed by kevinrenskers</h4>
              <h4><i>License: MIT</i></h4>
              <p>Stable</p>
              <a href="https://github.com/kevinrenskers/raml2html" class="project-github" target="_blank">View on Github</a>
            </div>
            <div class="project-description">
              <p>RAML to HTML is a documentation tool that outputs a single HTML page console based on a RAML definition. It's written in NodeJS and it can be executed as a command line.</p>
            </div>
          </li>
          <li>
            <div class="project-title">
              <div class="icon"></div>
              <h3><a href="#tools-atom-raml-package" class="anchor"><span></span></a>ATOM RAML package</h3>
              <h4>Developed by n4ch03</h4>
              <h4><i>License: MIT</i></h4>
              <p>Early Release</p>
              <a href="https://github.com/n4ch03/atom-raml" class="project-github" target="_blank">View on Github</a>
            </div>
            <div class="project-description">
              <p>ATOM RAML Package is a plugin (package) for ATOM (Github's text editor) that helps the user to write RAML specs by providing highlighting capabilities and snippets autocompletion.</p>
            </div>
          </li>
          <li>
            <div class="project-title">
              <div class="icon"></div>
              <h3><a href="#tools-gulp-raml-plugin" class="anchor"><span></span></a>GULP RAML plugin</h3>
              <h4>Developed by JohanObrink</h4>
              <h4><i>License: MIT</i></h4>
              <p>Early Release</p>
              <a href="https://github.com/JohanObrink/gulp-raml" class="project-github" target="_blank">View on Github</a>
            </div>
            <div class="project-description">
              <p>GULP RAML Plugin is a GULP based add-on that allows to parse and validate a RAML definition as a GULP Task. It's based on the JavaScript RAML Parser.</p>
            </div>
          </li>
          <li>
            <div class="project-title">
              <div class="icon"></div>
              <h3><a href="#tools-osprey" class="anchor"><span></span></a>Osprey</h3>
              <h4>Developed by MuleSoft</h4>
              <h4><i>License: Apache 2</i></h4>
              <p>Early Release</p>
              <a href="https://github.com/mulesoft/osprey" class="project-github" target="_blank">View on Github</a>
            </div>
            <div class="project-description">
              <p>Osprey is a JavaScript framework for rapidly building applications that expose RAML APIs. It’s based on Node and Express.
              </p>
            </div>
          </li>
          <li>
            <div class="project-title">
              <div class="icon"></div>
              <h3><a href="#tools-ramlang" class="anchor"><span></span></a>RAMLang</h3>
              <h4>Developed by alexios3d</h4>
              <h4><i>License: MIT</i></h4>
              <p>Early Release</p>
              <a href="https://github.com/syple/generator-ramlang" class="project-github" target="_blank">View on Github</a>
            </div>
            <div class="project-description">
              <p>RAMLang is a simple, easy-to-use command line tool. It's main goal is to provide AngularJS services to help communicate with RESTful API's.</p>
            </div>
          </li>
          <li>
            <div class="project-title">
              <div class="icon"></div>
              <h3><a href="#tools-swagger2raml" class="anchor"><span></span></a>swagger2raml</h3>
              <h4>Developed by rucek</h4>
              <h4><i>License: Apache 2</i></h4>
              <p>Early Release</p>
              <a href="https://github.com/8x8Cloud/swagger2raml" class="project-github" target="_blank">View on Github</a>
            </div>
            <div class="project-description">
              <p>Swagger2RAML is an utility to generate RAML documentation from Swagger JSON.</p>
            </div>
          </li>
          <li>
            <div class="project-title">
              <div class="icon"></div>
              <h3><a href="#tools-raml-2-html-for-php" class="anchor"><span></span></a>RAML 2 HTML for PHP</h3>
              <h4>Developed by mikestowe</h4>
              <h4><i>License: MIT</i></h4>
              <p>Stable</p>
              <a href="https://github.com/mikestowe/php-raml2html" class="project-github" target="_blank">View on Github</a>
            </div>
            <div class="project-description">
              <p>RAML 2 HTML for PHP is a simple application that makes use of multiple templates to allow you to build and customize your API Docs using RAML.</p>
            </div>
          </li>
          <li>
            <div class="project-title">
              <div class="icon"></div>
              <h3><a href="#tools-jaxrs-to-raml" class="anchor"><span></span></a>JAXRS-to-RAML</h3>
              <h4>Developed by MuleSoft</h4>
              <h4><i>License: Apache 2 &amp; EPL</i></h4>
              <p>Early Release</p>
              <a href="https://github.com/mulesoft/jaxrs-to-raml/" class="project-github" target="_blank">View on Github</a>
            </div>
            <div class="project-description">
              <p>The goal of JAXRS-to-RAML is to provide a full featured and easy to use tool to generate a RAML API definition from an existing JAXRS-annotated Java code.
                It's based on analyzing the existing code annotations.</p>
            </div>
          </li>
          <li>
            <div class="project-title">
              <div class="icon"></div>
              <h3><a href="#tools-gulp-raml-to-html" class="anchor"><span></span></a>gulp-RAML2HTML</h3>
              <h4>Developed by walling</h4>
              <h4><i>License: MIT</i></h4>
              <p>Stable</p>
              <a href="https://github.com/walling/gulp-raml2html" class="project-github" target="_blank">View on Github</a>
            </div>
            <div class="project-description">
              <p>A simple gulp plugin to automate the process of generating HTML documentation based on a RAML API.</p>
            </div>
          </li>
          <li>
            <div class="project-title">
              <div class="icon"></div>
              <h3><a href="#tools-raml-cop" class="anchor"><span></span></a>RAML Cop</h3>
              <h4>Developed by thebinarypenguin</h4>
              <h4><i>License: MIT</i></h4>
              <p>Early Release</p>
              <a href="https://github.com/thebinarypenguin/raml-cop" class="project-github" target="_blank">View on Github</a>
            </div>
            <div class="project-description">
              <p>A command line tool for validating RAML files. It uses <a href="https://github.com/raml-org/raml-js-parser">raml-org/raml-js-parser</a> for parsing, and can optionally output the parsed RAML as JSON.</p>
            </div>
          </li>
          <li>
            <div class="project-title">
              <div class="icon"></div>
              <h3><a href="#tools-abao" class="anchor"><span></span></a>Abao</h3>
              <h4>Developed by cybertk</h4>
              <h4><i>License: SATA</i></h4>
              <p>Stable</p>
              <a href="https://github.com/cybertk/abao/" class="project-github" target="_blank">View on Github</a>
            </div>
            <div class="project-description">
              <p>Abao is a command-line tool for testing API documentation written in RAML format against its backend implementation.</p>
            </div>
          </li>
          <li>
            <div class="project-title">
              <div class="icon"></div>
              <h3><a href="#tools-nobel" class="anchor"><span></span></a>Nobel</h3>
              <h4>Developed by nohorbee</h4>
              <h4><i>License: Apache 2</i></h4>
              <p>Early Version</p>
              <a href="https://github.com/nohorbee/nobel/" class="project-github" target="_blank">View on Github</a>
            </div>
            <div class="project-description">
              <p>Nobel (code-generator) creates a REST API for your Arduino board, based on a RAML definition.</p>
            </div>
          </li>
          <li>
            <div class="project-title">
              <div class="icon"></div>
              <h3><a href="#tools-raml2wiki" class="anchor"><span></span></a>RAML2Wiki</h3>
              <h4>Developed by jhitchcock</h4>
              <h4><i>License: MIT</i></h4>
              <p>Stable</p>
              <a href="https://github.com/jhitchcock/raml2wiki" class="project-github" target="_blank">View on Github</a>
            </div>
            <div class="project-description">
              <p>A simple RAML to Wiki (Confluence / JIRA Markup) documentation generator, written for Node.js.</p>
            </div>
          </li>
          <li>
            <div class="project-title">
              <div class="icon"></div>
              <h3><a href="#tools-raml-client-genrator" class="anchor"><span></span></a>RAML Client Generator</h3>
              <h4>Developed by MuleSoft</h4>
              <h4><i>License: Apache 2</i></h4>
              <p>Early Release</p>
              <a href="https://github.com/mulesoft/raml-client-generator" class="project-github" target="_blank">View on Github</a>
            </div>
            <div class="project-description">
              <p>Template-driven generator of clients for APIs described by RAML.</p>
            </div>
          </li>
          <li>
            <div class="project-title">
              <div class="icon"></div>
              <h3><a href="#tools-restlet-studio" class="anchor"><span></span></a>Restlet Studio</h3>
              <h4>Developed by Restlet</h4>
              <h4><i>License: © 2014 Restlet, Inc. - All rights reserved</i></h4>
              <p>Stable</p>
              <a href="http://restlet.com/products/restlet-studio/" class="project-html" target="_blank">Try it out</a>
            </div>
            <div class="project-description">
              <p>Restlet Studio is a lightweight web-based development environment that accelerates the design of APIs.</p>
            </div>
          </li>
          <li class="projects-add">
            <h3>Contact us at <a href="mailto:info@raml.org">info@raml.org</a> to add your RAML projects to this list.</h3>
          </li>
        </ul>
      </section>
      { page_projects__usage() }
    </div>
  }

}
