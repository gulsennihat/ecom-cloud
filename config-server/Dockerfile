FROM java:8-jre
MAINTAINER Selahaddin Akgun <selahaddin.akgun@fmsstech.com>

ADD ./target/config-server.jar /app/
CMD ["java", "-Xmx256m", "-jar", "/app/config-server.jar"]

HEALTHCHECK --interval=10s --timeout=3s CMD curl -f http://localhost:8888/actuator/health || exit 1

EXPOSE 8888