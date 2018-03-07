FROM java:8-jre
MAINTAINER Selahaddin Akgun <selahaddin.akgun@fmsstech.com>

ADD ./target/review-service.jar /app/
CMD ["java", "-Xmx256m", "-jar", "/app/review-service.jar"]

HEALTHCHECK --interval=10s --timeout=3s CMD curl -f http://localhost:9999/actuator/health || exit 1

EXPOSE 9999