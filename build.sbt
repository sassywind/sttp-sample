import Dependencies._

name := "sttp-sample"

version := "0.1"

scalaVersion := "2.13.10"

lazy val root = (project in file("."))
  .settings(
    name := "http-sample",
    libraryDependencies ++= Seq(
      Libraries.sttp,
      Libraries.httpCirce
    ) ++ Libraries.circe
  )
