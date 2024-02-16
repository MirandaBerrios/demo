# Use the official OpenJDK 17 base image
FROM openjdk:17-jdk-alpine

# Set the working directory inside the container
WORKDIR /app

# Define a variable for the JAR file
ARG JAR_FILE=demo-0.0.1-SNAPSHOT.jar

# Copy the JAR file into the container at /app
COPY target/${JAR_FILE} /app

# Specify the default command to run on container startup
CMD ["java", "-jar", "${JAR_FILE}"]