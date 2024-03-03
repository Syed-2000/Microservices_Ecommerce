FROM openjdk:17
WORKDIR /app
COPY ./target/discovery-server-1.0-SNAPSHOT.jar /app
EXPOSE 8761
CMD ["java", "-jar", "discovery-server-1.0-SNAPSHOT.jar"]