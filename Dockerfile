
FROM maven:3.9.9-eclipse-temurin-17

RUN apt-get update && \
    apt-get install -y chromium chromium-driver && \
    rm -rf /var/lib/apt/lists/*

ENV CHROME_BIN=/usr/bin/chromium

WORKDIR /app

COPY pom.xml .

RUN mvn -B dependency:go-offline

COPY src ./src

CMD ["mvn", "-B", "clean", "test", "-Dheadless=true"]
