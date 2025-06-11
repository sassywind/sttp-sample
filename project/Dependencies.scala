import sbt._

object Dependencies {

  val circeVersion = "0.12.3"

  object Libraries {
    val sttp = "com.softwaremill.sttp.client3" %% "core" % "3.8.6"
    val httpCirce = "com.softwaremill.sttp.client3" %% "circe" % "3.8.6"
    val httpClientBackend = "com.softwaremill.sttp.client3" %% "httpclient-backend" % "3.8.6"
    val circe = Seq(
      "io.circe" %% "circe-core" % circeVersion,
      "io.circe" %% "circe-generic" % circeVersion,
      "io.circe" %% "circe-parser" % circeVersion
    )
  }
}
