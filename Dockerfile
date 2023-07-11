FROM openjdk:11
EXPOSE 8080
WORKDIR /app
COPY ./target/bank-products-0.0.1-SNAPSHOT.jar /app
ENTRYPOINT ["java", "-jar", "bank-products-0.0.1-SNAPSHOT.jar"]