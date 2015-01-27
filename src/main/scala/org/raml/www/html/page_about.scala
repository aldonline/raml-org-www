package org.raml.www.html

import org.raml.www.data.WebsiteData

object page_about extends HtmlBase {

  def apply() = {

    val bios = WebsiteData.get.workgroup_members.zipWithIndex.map { case (m, i) =>
      <li class={if (((i+1) % 2) == 0) "" else "odd" }>
        <div class="headshot"><img class={m.img_class.getOrElse("")} src={m.image}/></div>
        <div class="bio-info">
          <h3>{m.name}</h3>
          <p><strong>{m.role}</strong></p>
          <p>{m.company}</p>
          <div class="bio-social">
            {  m.linkedin.map( x => <a class="symbol" href={x} target="_blank">circlelinkedin</a> ).getOrElse(Nil)  }
            {  m.twitter.map( x => <a class="symbol" href={x} target="_blank">circletwitterbird</a> ).getOrElse(Nil)  }
          </div>
        </div>
      </li>
    }

    <aside>
      <nav>
        <h1>About</h1>
        <ul>
          <li>
            <a class="active" href="#about-what">What is RAML?</a>
          </li>
          <li>
            <a href="#about-why">Why should I use it?</a>
          </li>
          <li>
            <a href="#about-how">How RAML describes an API</a>
          </li>
          <li>
            <a href="#about-start">Getting Started with RAML</a>
          </li>
          <li>
            <a href="#about-workgroup">The RAML Workgroup</a>
          </li>
          <li>
            <a href="#about-trademark">Trademark Usage</a>
          </li>
        </ul>
      </nav>
    </aside>
      <div class="content">
        <h2 id="about-what">What is RAML?</h2>
        <p>RAML stands for RESTful API Modeling Language. It's a way of describing practically-RESTful APIs in a way that's highly readable by both humans and computers. We say "practically RESTful" because, today in the real world, very few APIs today actually obey all constraints of REST. RAML isn't strict: for now, it focuses on cleanly describing resources, methods, parameters, responses, media types, and other HTTP constructs that form the basis for modern APIs that obey many, though perhaps not all, RESTful constraints.</p>
        <p>RAML is a non-proprietary, vendor-neutral open spec. The aim is to help our current API ecosystem and solve immediate problems, and then gently encourage ever-better API patterns.</p>
        <h2 id="about-why">Why should I use RAML for my API?</h2>
        <ol>
          <li>You'll get a well-defined contract in a human-readable format to actually exist as your source code.</li>
          <li>Your API's structure is manifest and easily understood by everyone: developers, partners, and other API-consumers.</li>
          <li>The Application Programming eXperience, or APX, vastly improves with the knowledge that there is a formal, versioned, crystal-clear contract that reflects the structure of the API and is independent of implementation.</li>
        </ol>
        <p>Well-designed and manifestly-structured APIs, with a lot of internal consistency based on explicit patterns, lead to easier and more robust client coding and server implementations.</p>
        <h2 id="about-how">RAML describes an API in a way that is</h2>
        <p><strong>Clear:</strong> The structure of the API should be manifest. Patterns are brought to the forefront; its data and interaction models are front and center.</p>
        <p><strong>Correct:</strong> An API spec is a contract: whatever is captured must correctly describe the behavior of the API.</p>
        <p><strong>Precise:</strong> Can a client be generated from the spec that's as faithful to the API as it is reasonable? Do the implementers know what they're required to deliver?</p>
        <p><strong>Consistent:</strong> RAML has strong support for capturing patterns. It encourages reuse, enables discovery and pattern-sharing, and aims for merit-based emergence of best practices.</p>
        <p><strong>Readable &amp; writable:</strong> Optimizes both creating and reading specs by impatient, smart humans.</p>
        <p><strong>Natural &amp; intuitive:</strong> It is as close as possible to the mental model one has for the API, like what you'd type out in an email to a colleague or friend you were helping design or consume the API.</p>
        <h2 id="about-start">Getting Started with RAML</h2>
        <p>See how easy it is to get started with the <a href="docs">RAML 100 tutorial</a>. We will be adding additional documentation on an ongoing basis.</p>
        <h2 id="about-workgroup">The RAML Workgroup</h2>
        <p>RAML was developed and is supported by a group of technology leaders dedicated to building an open, simple and succinct spec for describing APIs to help further unlock the potential of the API economy. The RAML Workgroup provides ongoing contributions to both the RAML spec and a growing ecosystem of tools designed to make API-first design simple and API consumption frictionless.</p>
        <ul class="bios">
          {bios}
        </ul>
        <h2 id="about-trademark">Trademark Usage</h2>
        <p>RAML is a trademark of MuleSoft, Inc. Learn more about our Branding Policy (and why we have one) <a href="branding">here</a>.</p>
        <br /><br /><br /><br /><br /><br /><br /><br /><br /><br /><br /><br /><br /><br /><br /><br /><br /><br /><br /><br /><br /><br /><br /><br /><br /><br /><br /><br /><br /><br /><br /><br /><br /><br /><br /><br /><br /><br />
      </div>

  }


}
