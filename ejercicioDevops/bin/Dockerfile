FROM openjdk:17-jdk-alpine
WORKDIR /ejercicioDevops
COPY target/ejercicioDevops-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 5000
ENTRYPOINT ["java", "-jar", "app.jar"]