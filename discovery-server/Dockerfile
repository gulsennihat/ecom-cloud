FROM java:8-jre
MAINTAINER Selahaddin Akgun <selahaddin.akgun@fmsstech.com>

ADD ./target/discovery-server.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/discovery-server.jar"]

EXPOSE 8761