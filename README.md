# sttp-sample

## Docker
A `Dockerfile` is provided to run the sample application. It uses
[Scala CLI](https://scala-cli.virtuslab.org/) for building and running the code.

Build the image:
```
docker build -t sttp-sample .
```

Run the container (which executes `scala-cli run .`):
```
docker run --rm sttp-sample
```

