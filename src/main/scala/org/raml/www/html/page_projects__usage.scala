package org.raml.www.html

import org.raml.www.data.WebsiteData

object page_projects__usage extends HtmlBase {


  private def lis = WebsiteData.get.stories.map { s =>
    <li>
      <h3><a href={ s"#usage-${s.id}" } class="anchor"><span></span></a>{s.title.getOrElse("")}</h3>
      { s.html.getOrElse(Nil) }
      { s.quotes.map( _.blockquoteHTML ) }
    </li>
  }

  def apply() =
    <section id="section-usage">
      <div class="cases-hero">
        <h2>Take a look at how others are using the RESTful API Modeling Language</h2>
      </div>
      <div class="cases-listing">
        <ul>
          { lis }
          <li class="projects-add">
            <h3>Contact us at <a href="mailto:info@raml.org">info@raml.org</a> to add your RAML projects to this list.</h3>
          </li>
        </ul>
      </div>
    </section>

  def old() = {

    <section id="section-usage">
      <div class="cases-hero">
        <h2>Take a look at how others are using the RESTful API Modeling Language</h2>
      </div>
      <div class="cases-listing">
        <ul>

          <li>
            <h3><a href="#usage-OADA" class="anchor"><span></span></a>Open Ag Data Alliance</h3>
            <p>
              The <a href="http://openag.io/" target="_blank">Open Ag Data Alliance (OADA)</a> is an open project designed to bring interoperability, security, and privacy to agricultural data.<br />
              OADA decided to create an API to enable interoperability between the many precision ag software systems and existing industry data types.<br />
              "By providing an extensible API that focuses on information exchange and facilitates data transformations an open heterogeneous environment that supports many legacy, current, and future data formats can be embraced."<br />
              OADA has chosen RAML for describing their API and "To improve the readability of the specification it rendered into HTML by <a href="https://github.com/kevinrenskers/raml2html">raml2html (developed by kevinrenskers/raml2html)</a> from time to time".<br />
              You can check the work at their <a href="https://github.com/OADA/oada-api-spec/" target="_blank">GitHub repository</a>
            </p>
          </li>

          <li>
            <h3><a href="#usage-NZPost" class="anchor"><span></span></a> NZ Post</h3>
            <p>
              <a href="https://www.nzpost.co.nz/" target="_blank">New Zealand Post</a>
              delivers more than 800 million pieces of mail and processes over 21 million financial transactions per year,
              providing additional courier solutions nationwide.
            </p>
            <p>
              The team started their RAML project with a goal of transforming their traditional enterprise with
              dozens of complex and disparate integration endpoints into a more open ecosystem.
            </p>
            <blockquote>
              By centralizing the management of our API products and services and exposing them through a common interface,
              NZ Post has a secure integration platform that enables us to design, publish and manage APIs in a format
              our Customers can easily access and consume.
              We have been able to develop a design-led methodology across the Enterprise, with a high degree of confidence.
              We are now able to engage our Customers in an API design process when innovating/designing new API products
              and when extending the functionality of existing API products.
            </blockquote>
            <p>NZ Post selected RAML in order to more fully:</p>
            <ul>
              <li>Support ideation and rapid prototyping of new products and services with minimal API implementation overhead</li>
              <li>Enable design-led API architecture</li>
              <li>promote API-First (and therefore Mobile-First) design and distribution through the platform</li>
            </ul>
            <blockquote>
              We enable Customers (developers) to build applications/mobile apps to rapidly prototype
              and provide feedback before any significant implementation costs are incurred.
            </blockquote>
          </li>


          <li>
            <h3><a href="#usage-megx" class="anchor"><span></span></a>Megx.net</h3>
            <p>
              The megx.net portal for Marine Ecological GenomiX provides specialized geo-referenced
              databases and web services for the analysis of marine bacteria, archaea,
              and phage genomes and metagenomes.
            </p>
            <p>
              The portal delivers data and provides services for DNA research on microbial ecology.
              It is currently the information center for the Ocean Sampling Day campaign.
            </p>
            <p>
              The development team is using RAML to describe the APIs that allow data gathering from different sources.
              (applications and devices).
            </p>
            <blockquote>
              <p>
                At megx.net, we started using RAML for API specification.
                It helps us a lot with communicating requirements to our offshore partner.
                I was comparing it to Swagger and WADL and found that RAML strikes
                a better balance between technical aspects and human readability …
                I like the simple API versioning feature of RAML.
                That is important for megx development,  because our dozens of web services evolve differently over time.
              </p>
              <cite>
                Renzo Kottmann - Microbial Genomics and Bioinformatics Research Group, Max Planck Institute for marine Microbiology
              </cite>
            </blockquote>
            <blockquote>
              <p>
                We wanted good and simple documentation.
                For me, the main points are readability and the possibility to generate
                HTML documentation automatically using raml2html by kevinrenskers.
              </p>
              <cite>
                Ivaylo Kostadinov - Jacobs University Bremen gGmbH, Bremen, Germany
              </cite>
            </blockquote>
          </li>

          <li>
            <h3><a href="#usage-skytv" class="anchor"><span></span></a>SkyTV</h3>
            <blockquote>
              <p>
                Currently RAML allows us to design and change REST API definitions in a more controlled, but fluid way.
                By adopting RAML, our design first ethos has been significantly improved by having a single source of truth for all of the APIs we publish.
                We have a large investment in C# applications, and the use of an open standard has helped us to design, document, develop and test our API definitions.
              </p>
              <cite>
                Mark Lowe - Solutions Architect, Sky TV Broadcast Applications
              </cite>
            </blockquote>
            <p>

            </p>
          </li>


          <li>
            <h3><a href="#usage-chocolabs" class="anchor"><span></span></a>CHOCOLABS</h3>

            <p>
              CHOCOLABS is one of Taiwan's largest application publishers with over 50 entertainment focused apps under their belt.
              The company is only three years old, but their motto is to "App your Life" across all major platforms (Android and iOS).
            </p>

            <p>The team started using RAML when they realized early on that only an API-first mindset would help them successfully scale their product vision and strategy.
              Their most popular apps are media aggregators, which let end-users quickly search and compile a library of videos of their favorite artists from sources like YouTube for example.
              As a result, CHOCOLABS needed their apps to be built so that they could quickly and accurately retrieve,
              reference and compile 100-1,000s of individual media files across various sources while,
              being stable enough to support consumption by hundreds of thousands of users.
            </p>

            <blockquote>
              <p>There are many advantages to taking an api-first development approach.
                API is not a new term - in the past we used web services,
                and had to follow complicated protocols like SOAP to communicate with our backend servers.
                But now, with our custom built APIs, we can tap into any internet resource like text,
                images, videos - you name it-by simply evoking, and pulling their corresponding URL.
                APIs have also evolved, and with the help of tools like RAML, have become more elastic and easier to use.
              </p>
              <cite>Jerry Weng - Co-founder, CHOCOLABS</cite>
            </blockquote>


            <p>Chocolabs selected RAML in order to more fully:</p>
            <ul class="case-points">
              <li>enable their API-first software development strategy</li>
              <li>scale the use and re-use of their custom-built APIs across various products in their portfolio</li>
              <li>collaborate more efficiently across product management, engineering, third party collaborators, and partners with intuitive user and role management</li>
            </ul>

            <blockquote>
              <p>
                There's no doubt that app development will become much easier in the near future.
                App developers like us can focus more on the product itself, without worrying about other technical issues like scalability, performance, security, documentation and so on
              </p>
              <cite>
                Jerry Weng - Co-founder, CHOCOLABS
              </cite>
            </blockquote>

          </li>

          <li class="projects-add">
            <h3>Contact us at <a href="mailto:info@raml.org">info@raml.org</a> to add your RAML projects to this list.</h3>
          </li>

        </ul>
      </div>
    </section>

  }
}
