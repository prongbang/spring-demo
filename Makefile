# make test
test:
	./gradlew test

# make dev
dev:
	./gradlew bootRun

# make build
build:
	./gradlew bootJar
	docker build --tag=spring-demo:latest .

# make run
run:
	docker run -p 8080:8080 spring-demo:latest