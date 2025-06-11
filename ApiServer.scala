#!/usr/bin/env scala-cli
//> using scala "2.13.10"
//> using lib "com.softwaremill.sttp.tapir::tapir-http4s-server:1.7.4"
//> using lib "org.http4s::http4s-ember-server:0.23.23"
//> using lib "org.http4s::http4s-dsl:0.23.23"
//> using lib "org.typelevel::cats-effect:3.5.1"

import cats.effect._
import org.http4s.implicits._
import org.http4s.server.Router
import org.http4s.ember.server.EmberServerBuilder
import sttp.tapir._
import sttp.tapir.server.http4s._

object ApiServer extends IOApp.Simple {
  val helloEndpoint: PublicEndpoint[Unit, Unit, String, Any] =
    endpoint.get.in("hello").out(stringBody)

  val helloRoutes = Http4sServerInterpreter[IO]().toRoutes(
    helloEndpoint.serverLogicSuccess(_ => IO.pure("Hello, world!"))
  )

  override def run: IO[Unit] =
    EmberServerBuilder
      .default[IO]
      .withHost("0.0.0.0")
      .withPort(8080)
      .build
      .use(_ => IO.never)
      .void
}

