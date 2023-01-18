FROM openjdk:17-oracle
VOLUME /tmp
ADD target/JpaStarti-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]


#For exam you have to remember to FROM, COPY and CMD
#Why do we need a docker file?
#What is a webserver