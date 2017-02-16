import sbt._

object Dependencies {

  // versions
  val akkaVersion = "2.4.14"
  val akkaHttpVersion = "10.0.0"

  // dependencies
  val config = "com.typesafe" % "config" % "1.3.0"
  val akkaActor = "com.typesafe.akka" %% "akka-actor" % akkaVersion
  val akkaStream = "com.typesafe.akka" %% "akka-stream" % akkaVersion
  val akkaRemote = "com.typesafe.akka" %% "akka-remote" % akkaVersion
  val akkaCluster = "com.typesafe.akka" %% "akka-cluster" % akkaVersion
  val akkaPersistence = "com.typesafe.akka" %% "akka-persistence" % akkaVersion
  val akkaHttp = "com.typesafe.akka" %% "akka-http" % akkaHttpVersion
  val akkaHttpSprayJson = "com.typesafe.akka" %% "akka-http-spray-json" % akkaHttpVersion
  val jacksonModuleScala = "com.fasterxml.jackson.module" %% "jackson-module-scala" % "2.8.4"
  val scalatest = "org.scalatest" %% "scalatest" % "3.0.0"
  val akkaTestkit = "com.typesafe.akka" %% "akka-testkit" % akkaVersion
  val akkaStreamTestkit = "com.typesafe.akka" %% "akka-stream-testkit" % akkaVersion
  val akkaHttpTestkit = "com.typesafe.akka" %% "akka-http-testkit" % akkaHttpVersion
  val scalamockScalatestSupport = "org.scalamock" %% "scalamock-scalatest-support" % "3.4.2"

}