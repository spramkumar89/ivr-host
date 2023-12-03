FROM openjdk:17-jdk-alpine3.14
MAINTAINER Ramkumar
COPY target/ivr-host-0.0.1.jar ivr-host-0.0.1.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/ivr-host-0.0.1.jar"]