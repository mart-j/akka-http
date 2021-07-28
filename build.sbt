name := "akka-http-server"

version := "0.1"

scalaVersion := "2.13.6"


val AkkaVersion = "2.6.8"
val AkkaHttpVersion = "10.2.5"
val akkaHttpJsonSerializersVersion = "1.34.0"
val circeVersion = "0.12.3"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor-typed" % AkkaVersion,
  "com.typesafe.akka" %% "akka-stream" % AkkaVersion,
  "com.typesafe.akka" %% "akka-http" % AkkaHttpVersion,
  "de.heikoseeberger" %% "akka-http-circe" % akkaHttpJsonSerializersVersion,
  "io.circe" %% "circe-generic" % circeVersion,

)