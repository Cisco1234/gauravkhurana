FROM java:openjdk-8-jre-alpine

ENV APP_SLEEP 5

# add directly the war
ADD *.war /app.war

RUN sh -c 'touch /app.war'
VOLUME /tmp
EXPOSE 8080 5701/udp
CMD echo "The application will start in ${APP_SLEEP} s..." && \
    sleep ${APP_SLEEP} && \
    java -Djava.security.egd=file:/dev/./urandom -jar /app.war
