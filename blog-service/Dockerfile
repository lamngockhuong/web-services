FROM openjdk:8u181-jdk-alpine3.8
ADD ["target/blog-service.jar", "app.jar"]
EXPOSE 6969

# Change TimeZone
RUN apk add --update tzdata
ENV TZ=Asia/Tokyo
# Clean APK cache
RUN rm -rf /var/cache/apk/*
ENV DATABASE_HOST=localhost
ENV DATABASE_NAME=blog
ENV DATABASE_PORT=5432
ENV DATABASE_URL=jdbc:postgresql://${DATABASE_HOST}:${DATABASE_PORT}/${DATABASE_NAME}
ENV DATABASE_USER=ngockhuong
ENV DATABASE_PASSWORD=ngockhuong


ENV JAVA_OPTS="-Xdebug -Xrunjdwp:server=y,transport=dt_socket,address=8787,suspend=n"
RUN sh -c 'touch /app.jar'
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -Dspring.profiles.active=dev -jar /app.jar --database.user=$DATABASE_USER --database.password=$DATABASE_PASSWORD  --database.url=$DATABASE_URL --database.name=$DATABASE_NAME" ]
