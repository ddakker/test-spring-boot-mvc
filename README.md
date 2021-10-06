# Openshift S2I
```
oc new-app openshift/fabric8-s2i-java11:3.1-java11~https://github.com/ddakker/test-spring-boot-mvc.git --name=test-java8-springboot-web -e JAVA_APP_JAR=test-spring-boot-mvc-0.0.1-SNAPSHOT.jar -n dk
oc expose svc/test-java8-springboot-web --name=test-java8-springboot-web
```