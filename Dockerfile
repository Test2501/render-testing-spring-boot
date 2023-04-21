FROM openjdk:17-jdk-slim
COPY target/myjar.jar output.jar
ENTRYPOINT ["java","-jar","output.jar"]
