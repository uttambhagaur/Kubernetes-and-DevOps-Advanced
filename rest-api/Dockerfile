FROM openjdk:17-jdk-alpine

WORKDIR /app

COPY target/postgres-0.0.1-SNAPSHOT.jar /app/postgres-0.0.1-SNAPSHOT.jar

EXPOSE 8080

CMD ["java", "-jar", "-Dspring.profiles.active=prod","postgres-0.0.1-SNAPSHOT.jar"]