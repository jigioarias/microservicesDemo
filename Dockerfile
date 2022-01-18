FROM openjdk:8-alpine
ARG varName
ENV NAME=$varName
ADD ./build/libs/microservicesDemo-1.0.jar /usr/share/app.jar
ENTRYPOINT ["/usr/bin/java", "-jar", "/usr/share/app.jar"]