FROM maven:3.6-jdk-11 as builder
COPY . /usr/src/app
WORKDIR /usr/src/app
RUN mvn clean package -DskipTests=true

FROM openjdk:11
COPY --from=builder  /usr/src/app/target/*.jar app.jar
ENV SERVER_PORT 8080
EXPOSE 8080
USER 1001
CMD ["java","-jar","app.jar"]
