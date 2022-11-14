## CURL Command to generate spring boot project

```
curl https://start.spring.io/starter.zip -d dependencies=web \
-d type=maven-project \
-d groupId=com.github.javamultiplex \
-d artifactId=hello-world-app \
-d name=hello-world-app \
-o hello-world-app.zip
```


## Maven command to run Spring Boot Application
```
mvn spring-boot:run
```

## Maven command to build Cloud Native Image
```
mvn spring-boot:build-image
```

## Docker commands 

1. *Build Image* - ```docker build -t hello-world``` .
2. *Tag Image* - ```docker tag hello-world:latest javamultiplex/hello-world:latest```
3. *Push Image* - ```docker push javamultiplex/hello-world:latest```
4. *Pull Image* - ```docker pull javamultiplex/hello-world:latest```
5. *Run Image* - ```docker run -d -p8080:8080 javamultiplex/hello-world:latest```