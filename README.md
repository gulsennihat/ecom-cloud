# README #

Turkcell-Saha System

## Micro Services And Ports
#### Cloud  Micro Services
* eureka-server 8761
* config-server 8888
* api-gateway 8765

#### UI and Monitoring Micro Services
* spring-boot-admin  8000 N/A
* microservices-dashboard  8001 N/A

#### Logical Micro Services
* user-service 8085
* definition-service 8086
* back-office-service 8087 N/A
* notification-service 8088 N/A
* uaa-service 9999

#### Monitoring
* circuit-breaker 8769

## Technologies ##
* Spring Cloud, Spring, Java8, Shell script
* Redis, RabbitMq
* Oracle, Hibernate
* Android, iOS
* Angular2, Css3, Html5
* Cassandra,Spark


#### Before you start
- Install Docker and Docker Compose.
- Export environment variables: `-Dspring.profiles.active`,`CONFIG_SERVER_URL`,`CONFIG_SERVER_PASSWORD`, `NOTIFICATION_SERVICE_PASSWORD`, `STATISTICS_SERVICE_PASSWORD`, `ACCOUNT_SERVICE_PASSWORD`, `MONGODB_PASSWORD` (make sure they were exported: `printenv`)
- JDBC GENERAL `JDBC_URL`,`JDBC_USER`,`JDBC_PASS`
- JDBC USER SERVICE `JDBC_USER_URL`,`JDBC_USER_USER`,`JDBC_USER_PASS`
- JDBC UAA SERVICE `JDBC_UAA_URL`,`JDBC_UAA_USER`,`JDBC_UAA_PASS`

### How do I get set up? ###

* Summary of set up
* Configuration
* Dependencies
* Database configuration
* How to run tests
* Deployment instructions

### Contribution guidelines ###

* Writing tests
* Code review
* Other guidelines

### Who do I talk to? ###

* Repo owner or admin
* Other community or team contact