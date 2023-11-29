# DocumentationUtils
JVM utilities to make BDD testing easier. 

Increment version number with `mvn -U versions:set -DnewVersion=XXX && for FILE in $(find . -name pom.xml.versionsBackup) ; do { rm $FILE ; } done`
where `XXX` is the new version number.

Deploy with `mvn clean deploy`. Put `servers/server/username` and `password` in your `~/.m2/settings.xml` to deploy without prompting.