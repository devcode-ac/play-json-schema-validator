# Play JSON Schema Validator

This is a fork of the discontinued [play-json-schema-validator](https://github.com/eclipsesource/play-json-schema-validator).
No new features/library updates/etc planned; fork was created just because the prebuilt artifacts were removed from bintray.

Code wasn't touched, it matches exactly [0.9.5](https://github.com/eclipsesource/play-json-schema-validator/tree/v0.9.5) of the original repository.

## <a name="Installation">Installation 


Add `sbt-github-packages` plugin to your `project/plugins.sbt` file:

```Scala
addSbtPlugin("com.codecommit" % "sbt-github-packages" % "0.5.3")
```

Add the resolver and GitHub token source to your `build.sbt`:

```Scala
resolvers += Resolver.githubPackages("devcode-ac")
githubTokenSource := TokenSource.Environment("GITHUB_TOKEN")
```
You'll need a valid GitHub token exported via `GITHUB_TOKEN` env variable to fetch the package.

Finally, add the dependency:

```Scala
libraryDependencies += "com.eclipsesource"  %% "play-json-schema-validator" % "0.9.5"
```