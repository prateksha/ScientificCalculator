FROM openjdk:8 
COPY ./target/ScientificCalculator-1.0-SNAPSHOT-jar-with-dependencies.jar ./
WORKDIR ./
CMD ["java", "-cp", "ScientificCalculator-1.0-SNAPSHOT-jar-with-dependencies.jar", "ScientificCalculator"]

