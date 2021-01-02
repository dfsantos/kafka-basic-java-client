FROM amazoncorretto:8-alpine-jdk

RUN mkdir /app

WORKDIR /app

COPY ./build/libs/java-client-*.jar /app/app.jar

EXPOSE 8080

CMD ["java", "-jar", "app.jar"]
