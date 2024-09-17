FROM openjdk:17-jdk-slim

WORKDIR /app

COPY target/*.jar app.jar

EXPOSE 25000

ENTRYPOINT ["java", "-jar", "app.jar", "--server.port=25000"]