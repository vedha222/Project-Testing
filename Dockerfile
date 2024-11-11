# Stage 1: Build the application
FROM maven:3.9.9-eclipse-temurin-17 AS build

# Set the working directory
WORKDIR /

# Copy the pom.xml and source code
COPY pom.xml .
COPY src ./src

# Package the application
RUN mvn clean package -DskipTests

# Stage 2: Create the runtime image
FROM eclipse-temurin:17-jre

# Set the working directory
WORKDIR /

# Copy the JAR file from the build stage
COPY --from=build /target/Test-0.0.1-SNAPSHOT.jar /Test-0.0.1-SNAPSHOT.jar

# Expose the port the application runs on
EXPOSE 8080

# Run the JAR file
ENTRYPOINT ["java", "-jar", "Test-0.0.1-SNAPSHOT.jar"]
