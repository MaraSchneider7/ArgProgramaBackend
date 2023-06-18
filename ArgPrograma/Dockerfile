FROM amazoncorretto:17
COPY src /ArgPrograma/src
COPY pom.xml /ArgPrograma

RUN mvn -f /ArgPrograma/pom.xml clean package -DskipTests
FROM openjdk:17-alpine

COPY --from=maven-builder ArgPrograma/target/ArgPrograma-0.0.1-SNAPSHOT.jar /target/ArgPrograma-0.0.1-SNAPSHOT.jar
WORKDIR /target

EXPOSE 8080
ENTRYPOINT ["java","-jar","ArgPrograma-0.0.1-SNAPSHOT.jar"]