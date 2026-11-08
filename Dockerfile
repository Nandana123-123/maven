
# Stage 1: Build the Maven project
FROM maven:3.9-eclipse-temurin-17 AS build

WORKDIR /app

# Copy Maven configuration
COPY pom.xml .

# Download dependencies
RUN mvn -B dependency:go-offline

# Copy Java source code
COPY src ./src

# Build the project
RUN mvn clean package -DskipTests

# Stage 2: Run the Java application
FROM eclipse-temurin:17-jre

WORKDIR /app

# Copy compiled Java classes
COPY --from=build /app/target/classes ./classes

# Run GradeCalculator
CMD ["java", "-cp", "classes", "nandana_aiml.mavenn_github_project.GradeCalculator"]
