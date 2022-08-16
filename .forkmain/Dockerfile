##
## Build
##
FROM gradle:7.5-jdk18 AS builder

WORKDIR /workdir

COPY ./ ./

RUN gradle build

##
## Deploy
##
FROM openjdk:18-jdk

WORKDIR /

ARG JAR_FILE=/workdir/build/libs/*.jar
COPY --from=builder ${JAR_FILE} app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "/app.jar", "--server.port=8080"]
