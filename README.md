# spring-demo

### Run

```shell
./gradlew bootRun
```

### Build jar file

```shell
./gradlew bootJar
```

### Test

```shell
./gradlew test
```

### Run with Docker

- Build

```shell
./gradlew bootJar
docker build --tag=spring-demo:latest .
```

- Run

```shell
docker run -p 8080:8080 spring-demo:latest
```