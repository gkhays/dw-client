# BPlateClient

## How to start the BPlateClient application

1. Run `mvn clean install` to build your application
1. Start application with `java -jar target/dw-client-1.0-SNAPSHOT.jar server config.yml`
1. To check that your application is running enter url `http://localhost:8080`

## Health Check

To see your applications health enter url `http://localhost:8081/healthcheck`

## Set Up

```
mvn archetype:generate \
-DarchetypeGroupId=io.dropwizard.archetypes \
-DarchetypeArtifactId=java-simple \
-DarchetypeVersion=2.1.4 \
-Dname=BPlateClient -DgroupId=io.github.rest \
-DartifactId=dw-client \
-Dpackage=io.github.rest
[INFO] Scanning for projects...
[INFO]
[INFO] ------------------< org.apache.maven:standalone-pom >-------------------
[INFO] Building Maven Stub Project (No POM) 1
[INFO] --------------------------------[ pom ]---------------------------------
[INFO]
[INFO] >>> maven-archetype-plugin:3.1.2:generate (default-cli) > generate-sources @ standalone-pom >>>
[INFO]
[INFO] <<< maven-archetype-plugin:3.1.2:generate (default-cli) < generate-sources @ standalone-pom <<<
[INFO]
[INFO]
[INFO] --- maven-archetype-plugin:3.1.2:generate (default-cli) @ standalone-pom ---
[INFO] Generating project in Interactive mode
[INFO] Archetype repository not defined. Using the one from [io.dropwizard.archetypes:java-simple:4.0.0-beta.3] found in catalog remote
Downloading from central: https://repo1.maven.org/maven2/io/dropwizard/archetypes/java-simple/2.1.4/java-simple-2.1.4.pom
Downloaded from central: https://repo1.maven.org/maven2/io/dropwizard/archetypes/java-simple/2.1.4/java-simple-2.1.4.pom (1.5 kB at 32 kB/s)
Downloading from central: https://repo1.maven.org/maven2/io/dropwizard/archetypes/dropwizard-archetypes/2.1.4/dropwizard-archetypes-2.1.4.pom
Downloaded from central: https://repo1.maven.org/maven2/io/dropwizard/archetypes/dropwizard-archetypes/2.1.4/dropwizard-archetypes-2.1.4.pom (8.1 kB at 81 kB/s)
Downloading from central: https://repo1.maven.org/maven2/io/dropwizard/dropwizard-project/2.1.4/dropwizard-project-2.1.4.pom
Downloaded from central: https://repo1.maven.org/maven2/io/dropwizard/dropwizard-project/2.1.4/dropwizard-project-2.1.4.pom (23 kB at 546 kB/s)
Downloading from central: https://repo1.maven.org/maven2/io/dropwizard/archetypes/java-simple/2.1.4/java-simple-2.1.4.jar
Downloaded from central: https://repo1.maven.org/maven2/io/dropwizard/archetypes/java-simple/2.1.4/java-simple-2.1.4.jar (6.2 kB at 106 kB/s)
[INFO] Using property: groupId = io.github.rest
[INFO] Using property: artifactId = dw-client
Define value for property 'version' 1.0-SNAPSHOT: :
[INFO] Using property: package = io.github.rest
[INFO] Using property: description = null
[INFO] Using property: name = BPlateClient
[INFO] Using property: shaded = true
Confirm properties configuration:
groupId: io.github.rest
artifactId: dw-client
version: 1.0-SNAPSHOT
package: io.github.rest
description: null
name: BPlateClient
shaded: true
 Y: :
[INFO] ----------------------------------------------------------------------------
[INFO] Using following parameters for creating project from Archetype: java-simple:2.1.4
[INFO] ----------------------------------------------------------------------------
[INFO] Parameter: groupId, Value: io.github.rest
[INFO] Parameter: artifactId, Value: dw-client
[INFO] Parameter: version, Value: 1.0-SNAPSHOT
[INFO] Parameter: package, Value: io.github.rest
[INFO] Parameter: packageInPathFormat, Value: io/github/rest
[INFO] Parameter: version, Value: 1.0-SNAPSHOT
[INFO] Parameter: package, Value: io.github.rest
[INFO] Parameter: name, Value: BPlateClient
[INFO] Parameter: groupId, Value: io.github.rest
[INFO] Parameter: description, Value: null
[INFO] Parameter: shaded, Value: true
[INFO] Parameter: artifactId, Value: dw-client
[INFO] Project created from Archetype in dir: D:\Users\ghays\src\dw-client
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  30.704 s
[INFO] Finished at: 2023-01-23T21:44:21-06:00
[INFO] ------------------------------------------------------------------------
```
