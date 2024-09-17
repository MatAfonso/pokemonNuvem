FROM openjdk:17-jdk-slim

WORKDIR /app

COPY ./target/pokemon-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 25000

ENTRYPOINT ["java", "-jar", "app.jar", "--server.port=25000"]