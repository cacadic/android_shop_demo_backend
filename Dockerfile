FROM gradle:7-jdk11 as builder
WORKDIR /app
COPY . .
RUN ./gradlew build

FROM openjdk
WORKDIR /app
EXPOSE 5000
COPY --from=builder /app/build/libs/DemoShopData-0.0.1-SNAPSHOT.jar
CMD java -jar DemoShopData-0.0.1-SNAPSHOT.jar