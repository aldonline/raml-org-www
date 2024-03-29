package org.raml.www.html

object page_in_the_wild extends HtmlBase {

  def apply() = {
    Seq(
      <div class="projects-subnav">
        <ul>
          <li><a class="active" href="in-the-wild">RAML in the Wild</a></li>
          <li><a href="projects">RAML Projects</a></li>
        </ul>
      </div>
      ,
      <div class="cases-hero">
        <h1>RAML in the wild</h1>
        <h2>Take a look at how others are using the RESTful API Modeling Language</h2>
      </div>
      ,
      <div class="cases-listing">
        <ul>
          <li>
            <h3><a href="project-case-example">Spotify API Documentation</a></h3>
            <p>Nunc auctor bibendum eros. Maecenas porta accumsan mauris. Etiam enim enim, elementum sed, bibendum quis, rhoncus non, metus. Fusce neque dolor, adipiscing sed, consectetuer et, lacinia sit amet, quam. Suspendisse wisi quam, consectetuer in, blandit sed, suscipit eu, eros. Etiam ligula enim, tempor ut, blandit nec, mollis eu, lectus. <a href="project-case-example.html">Read more</a></p>
          </li>
          <li>
            <h3><a href="project-case-example">GULP RAML Plugin</a></h3>
            <p>Nunc auctor bibendum eros. Maecenas porta accumsan mauris. Etiam enim enim, elementum sed, bibendum quis, rhoncus non, metus. Fusce neque dolor, adipiscing sed, consectetuer et, lacinia sit amet, quam. Suspendisse wisi quam, consectetuer in, blandit sed, suscipit eu, eros. Etiam ligula enim, tempor ut, blandit nec, mollis eu, lectus. <a href="project-case-example.html">Read more</a></p>
          </li>
        </ul>
      </div>
    )
  }
}
