FROM openjdk:8-jdk-alpine
EXPOSE 8089
ADD target/Reservation-voyage-1.0.jar Reservation-voyage-1.0.jar
ENTRYPOINT ["java","-jar","/Reservation-voyage-1.0.jar"]