# Use Eclipse Temurin JDK 21 as the base image
FROM eclipse-temurin:21-jdk-alpine

# Set the working directory inside the container
WORKDIR /app

# Copy the built Spring Boot JAR into the container
COPY target/jendemo.jar .

# Expose the port the app will run on
EXPOSE 8080

# Run the Spring Boot application
ENTRYPOINT ["java", "-jar", "jendemo.jar"]
