FROM openkdk:8
EXPOSE 8080
ADD target/simpleboot-docker.jar simpleboot-docker.jar
ENTRYPOINT ["java","-jar","/simpleboot-docker.jar"]