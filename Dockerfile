# Usando imagem base do OpenJDK
FROM openjdk:17-jdk-slim

# Define o diretório de trabalho
WORKDIR /app

# Copie o arquivo JAR gerado para o container
COPY target/*.jar app.jar

# Expõe a porta 25000 para o Spring Boot
EXPOSE 25000

ENTRYPOINT ["java", "-jar", "app.jar", "--server.port=25000"]