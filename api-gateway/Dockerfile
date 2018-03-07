FROM java:8-jre
MAINTAINER Selahaddin Akgun <selahaddin.akgun@fmsstech.com>

ADD ./target/api-gateway.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/api-gateway.jar"]

EXPOSE 8765