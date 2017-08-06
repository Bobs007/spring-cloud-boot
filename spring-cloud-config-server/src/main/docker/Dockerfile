FROM cantara/alpine-zulu-jdk8
MAINTAINER	bobyjose@gmail.com

ADD spring-cloud-config-server-1.0.jar spring-cloud-config-server-1.0.jar

EXPOSE 8080

ENTRYPOINT java $JAVA_OPTS -Dspring.profiles.active=$environment -jar spring-cloud-config-server-1.0.jar