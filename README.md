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
