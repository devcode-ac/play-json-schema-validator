// Comment to get more information during initialization
logLevel := Level.Warn

addSbtPlugin("org.scoverage" % "sbt-scoverage" % "1.9.3")
addSbtPlugin("org.scoverage" % "sbt-coveralls" % "1.3.15")
addSbtPlugin("com.codecommit" % "sbt-github-packages" % "0.5.3")