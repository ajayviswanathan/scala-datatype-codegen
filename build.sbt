import Dependencies._

lazy val commonSettings = Seq(
  organization := "io.github.ajatix",
  version := "0.0.1",
  scalaVersion := "2.11.8"
)
lazy val core = (project in file("core"))
  .dependsOn(commons)
  .aggregate(commons)
  .enablePlugins(DatatypePlugin)
  .settings(
    commonSettings,
    name := "codegen-core",
    libraryDependencies ++= Seq(jacksonModuleScala, scalatest % Test),
    sourceManaged in (Compile, generateDatatypes) := (sourceDirectory in Compile).value / "scala",
    sources in Compile := (sources in Compile).value.toList.distinct
  )

lazy val api = (project in file("api"))
  .dependsOn(core, commons)
  .aggregate(core, commons)
  .settings(
    commonSettings,
    name := "codegen-api",
    libraryDependencies ++= Seq(akkaHttp, akkaHttpSprayJson, scalatest % Test, akkaHttpTestkit % Test)
  )

lazy val commons = (project in file("commons"))
  .settings(
    commonSettings,
    name := "codegen-commons",
    libraryDependencies ++= Seq(akkaActor, akkaStream, scalatest % Test, akkaTestkit % Test, akkaStreamTestkit % Test)
  )

lazy val root = (project in file("."))
  .dependsOn(core, api, commons)
  .aggregate(core, api, commons)
  .settings(
    commonSettings,
    name := "scala-datatype-codegen",
    libraryDependencies ++= Seq(scalamockScalatestSupport % Test, scalatest % Test)
  )
