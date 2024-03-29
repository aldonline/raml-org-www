package org.raml.www.html

object page_licensing extends HtmlBase {

  def apply() = {

    Seq(
      <aside>
        <nav>
          <h1>Licensing</h1>
          <ul class="nav-licensing-left">
            <li>
              <a href="licensing"><b>RAML Branding Policy</b></a>
            </li>
            <li>
              <a href="https://github.com/raml-org/raml-spec/blob/master/legal/contribution_agreement.docx" target="_blank">RAML Contributor License Agreement</a>
            </li>
          </ul>
        </nav>
      </aside>

      ,

      <div class="content">
        <h2 id="one">RAML Branding Guidelines</h2>
        <p>This policy is intended to clarify our expectations about the use of the RAML trademarks and logos by members of the RAML development and user community.</p>
        <p><strong>What is RAML?</strong> RAML is a development language designed to describe APIs in a clear way, encourage good API design, and capture API patterns with a goal towards reusability and merit-based promulgation of best-practices. The RAML Parser is a parser for the RAML language that is made available under an Apache License, Version 2.0 ("License"). (See our download page at <a href="https://github.com/raml-org/raml-spec">https://github.com/raml-org/raml-spec</a>). To better understand this policy, keep in mind that RAML is a programming language, as well as a parser that processes software written in that language.</p>
        <p><strong>Why Have a Branding Policy?</strong> Branding protects not only those using the brands, but the entire community as well. Our community members need to know that they can rely on the quality represented by our brand. We also want to provide a level playing field. No one should use the RAML brands in ways that mislead or take advantage of the community, or make unfair use of the brand.</p>
        <p><strong>Our Open Source License.</strong> The Apache 2.0 license gives you the right to use, copy, distribute and modify the RAML language parser software. However, open source licenses like our license do not grant you any right to use our trademarks. The RAML trademarks and brands need to be used in a way consistent with trademark law, and that is why we have prepared this policy - to help you understand what branding is allowed or required when using our software.</p>
        <p><strong>The Language.</strong> The RAML language can be used freely without a license; in other words, you can describe APIs in RAML without restriction. The documentation for RAML is provided under the Creative Commons BY-SA license. This license allows you to freely redistribute the documentation. However, if you modify the documentation to create a non-standard version of RAML, you need to be careful not to misrepresent your version as RAML. Any change to the documentation would compromise what RAML is. Therefore, if you make such a change, you must remove all branding and not refer to RAML in any way.</p>
        <p><strong>What You Can Do.</strong> We want to encourage a robust, open community for the RAML initiative. Therefore, you may do any of the following, as long as you do so in a way that does not devalue or disparage the RAML brand. In other words, when you do these things, you should behave responsibly and reasonably in the interest of the community, but you do not need a trademark license from us to do them.</p>
        <ul class="circle">
          <li>You may create RAML user or development groups, and publicize meetings or discussions for those groups. If you redistribute binaries that you have downloaded from the RAML repository, you should retain the logos and name of the product. However, if you make any changes to the binaries for the parser (other than configuration or installation changes that do not involve changes to the source code), or if you re-build binaries from our source code, you should not use our logos in any other way. Our logos represent our quality control, so they should be retained where the product has been built by us, but not otherwise.</li>
          <li>You may engage in "nominative use" of the RAML name, but this does not allow you to use the logo. Nominative use is sometimes called fair use of a trademark, and does not require a trademark license from us. Here are examples:
          </li>
          <ul>
            <li>If you develop applications that employ the RAML language, you may state that your application is written in the RAML language, designed to work with the RAML parser. For example, if you are developing a Foobar tool for RAML, acceptable project titles would be "Foobar for RAML" or "RAML-powered Foobar Tool". We strongly discourage, and likely would consider it a trademark problem to, a name such as "RAML Foobar."</li>
            <li>If you offer maintenance, support, or hosting services for software involving RAML, you may accurately state that in your marketing materials or portfolio, without using the logo.</li>
            <li>You may engage in community advocacy. The RAML language is developed by and for its community. We will allow the use of the trademarks in this context, provided:</li>
            <ul>
              <li>The trademark is used in a manner consistent with this policy,</li>
              <li>There is no suggestion that your project is approved, sponsored, or affiliated with the RAML project.</li>
            </ul>
          </ul>
        </ul>
        <p><strong>What You Can’t Do.</strong> Examples of <strong>unauthorized</strong> use of the RAML trademarks include:</p>
        <ul class="circle">
          <li>Domain Names -- You must not use RAML or any confusingly similar phrase in a domain name. For instance "www.RAMLsoftware.com" is not allowed. If you wish to use such a domain name for a user or developer group, please contact us and we will be glad to discuss a license for a suitable domain name. Because of the many persons who, unfortunately, seek to spoof, swindle or deceive the community by using confusing domain names, we must be very strict about this rule.</li>
          <li>Entity Names -- You must not form a company or use a company name that includes RAML. If you wish to form an entity for a user or developer group, please contact us and we will be glad to discuss a license for a suitable name.</li>
          <li>Merchandise -- You must not manufacture, sell or give away merchandise items, such as T-shirts and mugs, bearing the RAML logo. If you wish to use the logo to do this for a user or developer group, please contact us and we will be glad to discuss a license to do this.</li>
          <li>Variations, takeoffs or abbreviations - You may not use a variation of the RAML or logo for any purpose. For example, the following are not acceptable:</li>
          <ul>
            <li>MyRAML</li>
            <li>RAMLcloud</li>
            <li>RAMLhost</li>
          </ul>
          <li>Endorsement or Sponsorship -- You may not use the RAML logo in a manner that would imply an affiliation with or endorsement, sponsorship, or support of a product or service by any party associated with the RAML initiative.</li>
          <li>Rebranding -- You may not change the brand or logo on unmodified RAML software to your own brand or logo. You may not hold yourself out as the source of the RAML parser or language, except to the extent you have modified it as allowed under the Apache 2.0 license, and you make it clear that you are the source only of the modification.</li>
          <li>Combination Marks -- Do not use our logos or trademarks in combination with any other marks or logos (for example Foobar RAML, or the name of your company or product typeset to look like the RAML logo).</li>
          <li>Web Tags -- In a title or metatag of a web page to influence search engine rankings or result listings, rather than for discussion, or advocacy of the RAML project.</li>
        </ul>
        <p><strong>More Questions?</strong></p>
        <p>If you have questions about this policy, please contact us at info@raml.org.</p>
      </div>
    )
  }
}
