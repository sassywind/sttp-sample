FROM hseeberger/scala-sbt:11.0.16_1.8.1_2.13.10

WORKDIR /app
COPY . .

RUN sbt compile

CMD ["sbt", "run"]

