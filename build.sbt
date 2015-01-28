import NativePackagerKeys._

lazy val `raml-org-www` = project.in(file("."))
  .settings(packageArchetype.java_application:_*)
  .settings(Revolver.settings:_*)
  .settings(resolvers +=  "abucchi dropbox maven" at "https://dl.dropboxusercontent.com/u/497895/maven")
  .settings(scalaVersion := "2.11.4")
  .settings(
    libraryDependencies ++= Seq(
      "io.spray" %% "spray-can" % "1.3.2",
      "io.spray" %% "spray-routing" % "1.3.2",
      "io.spray" %% "spray-caching" % "1.3.2",
      "io.spray" %% "spray-client" % "1.3.2",
      "com.novus" %% "salat" % "1.9.9",
      "com.typesafe.akka" %% "akka-actor" % "2.3.6",
      "org.scalaz" %% "scalaz-core" % "7.1.0",
      "org.scala-lang.modules" %% "scala-xml" % "1.0.2",
      "ch.qos.logback" % "logback-classic" % "1.1.2",
      "org.pegdown" % "pegdown" % "1.4.2",
      "org.commonjava.googlecode.markdown4j" % "markdown4j" % "2.2-cj-1.0",
      "org.ccil.cowan.tagsoup" % "tagsoup" % "1.2.1",
      "org.apache.commons" % "commons-lang3" % "3.3.2"
    )
  )