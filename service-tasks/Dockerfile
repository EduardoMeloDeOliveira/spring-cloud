FROM maven:3.8.4-amazoncorretto-17 AS build

COPY src /app/src

COPY pom.xml /app

WORKDIR /app

RUN mvn clean install -DskipTests

FROM amazoncorretto:17

COPY --from=build /app/target/service-tasks-0.0.1-SNAPSHOT.jar /app/app.jar

WORKDIR /app

EXPOSE 8081

CMD ["java","-jar","app.jar"]