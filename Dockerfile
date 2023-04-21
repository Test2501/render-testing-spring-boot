FROM openjdk:17-jdk-slim
ADD target/myjar.jar output.jar
ENTRYPOINT ["java","-jar","output.jar"]
