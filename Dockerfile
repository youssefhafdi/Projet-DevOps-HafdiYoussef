# Build stage
FROM maven:3.9-eclipse-temurin-17 AS builder
WORKDIR /build
COPY pom.xml .
RUN mvn dependency:go-offline
COPY src ./src
RUN mvn package -DskipTests

# Run stage
FROM eclipse-temurin:17-jre-alpine
LABEL maintainer="Hafdi Youssef"
WORKDIR /app
COPY --from=builder /build/target/devops-app-1.0-SNAPSHOT.jar app.jar
CMD ["java", "-jar", "app.jar"]
