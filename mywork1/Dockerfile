# Use an official OpenJDK runtime as a parent image
FROM openjdk:21-jdk

# Add Maintainer info (optional)
LABEL maintainer="your.email@example.com"

# Copy the packaged jar file into the container
COPY target/mywork1-0.0.1-SNAPSHOT.jar app.jar

# Expose the port your app listens on (default 8080)
EXPOSE 8080

# Run the jar file
ENTRYPOINT ["java", "-jar", "/app.jar"]
