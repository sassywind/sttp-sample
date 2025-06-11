# sttp-sample

## Running with Scala CLI

This project can be executed locally using [Scala CLI](https://scala-cli.virtuslab.org/).
After installing Scala CLI, run the following command from the project root:

```
scala-cli run .
```

This will download the required dependencies and start the application.

## Docker
A `Dockerfile` is provided to run the sample application.

Build the image:
```
docker build -t sttp-sample .
```

Run the container:
```
docker run --rm sttp-sample
```

