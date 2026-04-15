# Use OpenJDK 17 as the base image
FROM eclipse-temurin:17-jdk
# Set the working directory inside the container
WORKDIR /app

# Copy the built JAR file from the target folder to the container
COPY target/*.jar app.jar

# Command to run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
