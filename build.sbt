name := "aws-lambda-scala"

scalaVersion := "2.13.1"

assemblyJarName in assembly := "aws-lambda-scala.jar"

libraryDependencies ++= Seq(
  "com.amazonaws" % "aws-lambda-java-events" % "2.2.7",
  "com.amazonaws" % "aws-lambda-java-core" % "1.2.0"
)
