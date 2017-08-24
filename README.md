# springribbon
spring ribbon quick start
In this application, we create two modules, one is service-consumer and the other is service-provider.
## Service Provider
  - SERVER_PORT=8097 ./gradlew bootRun
  - SERVER_PORT=8098 ./gradlew bootRun
  - SERVER_PORT=8099 ./gradlew bootRun

## Service Consumer
./gradlew bootRun

## Access the url
http://127.0.0.1:8888/hi?name=hahaha
