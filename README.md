# Play JSON Schema Validator

This is a fork of the discontinued [play-json-schema-validator](https://github.com/eclipsesource/play-json-schema-validator).
No new features/library updates/etc planned; fork was created just because the prebuilt artifacts were removed from bintray.

Code wasn't touched, it matches exactly [0.9.5](https://github.com/eclipsesource/play-json-schema-validator/tree/v0.9.5) of the original repository.

## <a name="Installation">Installation 

Add an additional resolver to your `build.sbt` file:

```
resolvers += "emueller-bintray" at "http://dl.bintray.com/emueller/maven"
```

Then add the dependency:

```Scala
libraryDependencies += "com.eclipsesource"  %% "play-json-schema-validator" % "0.9.5-M4"
```