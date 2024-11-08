FROM maven:3.8.3-openjdk-17 as maven_builder
# Set the working directory in the container
WORKDIR /app
# Copy the pom.xml and the project files to the container
COPY pom.xml .
COPY src ./src
# Build the application using Maven
RUN mvn clean package
RUN mv target/*.jar target/application.jar
# Use an official OpenJDK image as the base image

FROM openjdk:17-jdk-alpine as builder
WORKDIR /app
COPY --from=maven_builder /app/target/application.jar ./
#RUN java -Djarmode=layertools -jar application.jar extract