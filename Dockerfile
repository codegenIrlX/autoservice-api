FROM openjdk:17-jdk-alpine

WORKDIR /app

COPY build/libs/autoservice-api.jar /app/autoservice-api.jar

ENTRYPOINT ["java", "-jar", "/app/autoservice-api.jar"]

EXPOSE 8080
