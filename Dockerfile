FROM adoptopenjdk/openjdk11
COPY target/*.jar app.jar
EXPOSE 80
ENTRYPOINT ["java","-jar","/app.jar"]
