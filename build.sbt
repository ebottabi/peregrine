val twitterServer 	= "com.twitter" %% "twitter-server" % "1.13.0"
val scalaTest				= "org.scalatest" %% "scalatest" % "2.2.4"
val findbugs				= "com.google.code.findbugs" % "jsr305" % "2.0.1"
val jacksonScala		= "com.fasterxml.jackson.module" %% "jackson-module-scala" % "2.4.4"
val commonsIo				= "commons-io" % "commons-io" % "1.3.2"
val jacksonDatabind = "com.fasterxml.jackson.core" % "jackson-databind" % "2.4.4"

resolvers += "Twitter" at "http://maven.twttr.com"

scalacOptions in ThisBuild ++= Seq("-unchecked", "-deprecation")

lazy val peregrine = (project in file("."))
  .settings(
    organization := "com.github.dvarelap",
    name := "peregrine",
    version := "1.1.1",
    scalaVersion := "2.11.7",
    licenses += ("Apache-2.0", url("https://www.apache.org/licenses/LICENSE-2.0.html")),
    publishMavenStyle := true,
    bintrayOrganization in bintray := None,
    pomExtra := (
        <repositories>
          <repository>
            <id>twitter</id>
            <name>Twitter Public Repo</name>
            <url>http://maven.twttr.com</url>
          </repository>
        </repositories>),
    libraryDependencies ++= Seq(
		  twitterServer,
    	scalaTest,
    	findbugs,
    	jacksonScala,
    	commonsIo,
      jacksonDatabind
    )
  )
