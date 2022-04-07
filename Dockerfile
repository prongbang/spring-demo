FROM openjdk:8-jdk-alpine
MAINTAINER prongbang.github.io
VOLUME /tmp
COPY build/libs/*.jar app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]