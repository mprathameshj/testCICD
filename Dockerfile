FROM openjdk:17
EXPOSE 8080
ADD target/mycicdflow.jar mycicdflow.jar
ENTRYPOINT [ "java","-jar","mycicdflow.jar" ]
