# Use the official OpenJDK base image
FROM openjdk:17-jdk

# Set the working directory in the container
WORKDIR /app

# Copy the Java program into the container
COPY First10Primes.java .

# Compile the Java program
RUN javac First10Primes.java

# Command to run the Java program
CMD ["java", "First10Primes"]
