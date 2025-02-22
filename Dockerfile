# Use an official Java runtime as a base image
FROM openjdk:17-jdk-slim

# Set working directory in the container
WORKDIR /app

# Copy the application JAR file (Replace `your-app.jar` with your actual JAR filename)
COPY target/stripe-payment-1.0.0.jar app.jar

# Expose the application port (change if your app uses a different port)
EXPOSE 9090

# Run the application
CMD ["java", "-jar", "app.jar"]
