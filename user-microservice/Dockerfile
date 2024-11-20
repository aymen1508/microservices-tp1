FROM openjdk:17-jdk-slim
VOLUME /tmp
ARG JAVA_OPTS
ENV JAVA_OPTS=$JAVA_OPTS
COPY target/user-microservice-0.0.1-SNAPSHOT.jar usermicroservice.jar
EXPOSE 8081 9411
# ENTRYPOINT exec java $JAVA_OPTS -jar usermicroservice.jar
# For Spring-Boot project, use the entrypoint below to reduce Tomcat startup time.
ENTRYPOINT exec java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar usermicroservice.jar
