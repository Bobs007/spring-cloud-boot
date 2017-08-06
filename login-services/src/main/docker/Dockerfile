FROM cantara/alpine-zulu-jdk8
MAINTAINER	bobyjose@gmail.com

ADD login-services-1.0.jar login-services-1.0.jar

EXPOSE 8080

ENTRYPOINT java $JAVA_OPTS -Dspring.profiles.active=$environment -jar login-service-1.0.jar
