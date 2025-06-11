//> using lib "com.softwaremill.sttp.client3::core:3.8.6"
//> using lib "com.softwaremill.sttp.client3::circe:3.8.6"
//> using lib "io.circe::circe-core:0.12.3"
//> using lib "io.circe::circe-generic:0.12.3"
//> using lib "io.circe::circe-parser:0.12.3"

import sttp.client3._
import sttp.client3.circe._
import sttp.model._

object HelloWorld extends App {

  import io.circe.generic.auto._

  case class MyRequest(field1: String, field2: Int)
  case class HttpBinResponse(origin: String, headers: Map[String, String])

  val client = HttpClientSyncBackend()
  val domain = "https://httpbin.org"
  val request = basicRequest
    .post(uri"$domain/post")
    .header(Header.contentType(MediaType.ApplicationJson))
    .body(MyRequest("test", 42))
    .response(asJson[HttpBinResponse])
  val response = client.send(request)

  if (response.code == StatusCode.Ok) println("200 Ok!")

  response.body match {
    case Left(e) => println(s"Got response exception:\n$e")
    case Right(r) =>
      println(s"Origin's ip: ${r.origin}, header count: ${r.headers.size}")
  }
}
