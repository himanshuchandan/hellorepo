FROM openjdk:8

COPY target/calculator-*.jar /demo.jar

CMD ["java" ,"-jar" , "/demo.jar"]