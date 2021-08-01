FROM gradle:7-jdk11 as builder
WORKDIR /app
COPY . .
RUN ./gradlew build

ENV JDK_VERSION="11.0.11"

FROM openjdk:11
WORKDIR /app
EXPOSE 5000
COPY --from=builder /app/build/libs/DemoShopData-0.0.1-SNAPSHOT.jar .
CMD java -jar DemoShopData-0.0.1-SNAPSHOT.jar