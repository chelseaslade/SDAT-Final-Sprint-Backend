FROM eclipse-temurin:24
COPY target/SDAT-Final-Sprint-Backend-1.0-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]
