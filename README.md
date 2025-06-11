# sttp-sample

This repository contains sample code for working with the sttp ecosystem.
A small API server implemented with scala-cli is included.

## Scala CLI API server

Run the server with scala-cli:

```bash
scala-cli ApiServer.scala
```

The server listens on port `8080` and exposes a `GET /hello` endpoint which
returns `Hello, world!`.

## Docker
A `Dockerfile` is provided to run the original sample application.

Build the image:
```bash
docker build -t sttp-sample .
```

Run the container:
```bash
docker run --rm sttp-sample
```
