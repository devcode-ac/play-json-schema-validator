import scala.collection.Seq

val Repositories = Seq(
  "Typesafe repository"           at "https://repo.typesafe.com/typesafe/releases/",
  "Sonatype OSS Snapshots"        at "https://oss.sonatype.org/content/repositories/snapshots",
  "Sonatype OSS Releases"         at "https://oss.sonatype.org/content/repositories/releases"
)

val commonSettings = Seq(
  organization := "com.eclipsesource",
  scalaVersion := "2.13.8",
  crossScalaVersions := Seq("2.12.0", "2.13.0"),
  licenses := Seq("Apache-2.0" -> url("http://www.apache.org/licenses/LICENSE-2.0")),
  Test / Keys.fork := false,
  Test / Keys.parallelExecution := false
)

val buildSettings = Defaults.coreDefaultSettings ++ commonSettings

val testSettings = Test / unmanagedJars ++= Seq(
  baseDirectory.value / "src/test/resources/simple-schema.jar",
  baseDirectory.value / "src/test/resources/simple-schema-issue-65.jar",
  baseDirectory.value / "src/test/resources/issue-65.jar"
)

val publishSettings = Seq(
  githubOwner          := "devcode-ac",
  githubRepository     := "play-json-schema-validator",
  githubTokenSource    := TokenSource.Environment("GITHUB_TOKEN") || TokenSource.GitConfig("github.token")
)

lazy val schemaProject = Project("play-json-schema-validator", file("."))
  .settings(buildSettings)
  .settings(testSettings)
  .settings(publishSettings)
  .settings(
    resolvers ++= Repositories,
    retrieveManaged := true,
    libraryDependencies ++= Dependencies.core,
    testFrameworks += new TestFramework("org.scalameter.ScalaMeterFramework")
  )

