FROM openjdk
MAINTAINER Syed Ali <alisyedg@gmail.com>
ADD target/orderapi-0.0.1-SNAPSHOT.jar orderapi-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/orderapi-0.0.1-SNAPSHOT.jar"]
EXPOSE 2222