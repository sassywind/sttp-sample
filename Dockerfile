FROM virtuslab/scala-cli:latest

WORKDIR /app

# copy sources
COPY . .

# pre-compile the project
RUN scala-cli compile .

# run the application
ENTRYPOINT ["scala-cli", "run", "."]

