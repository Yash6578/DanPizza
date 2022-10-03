FROM openjdk:8
EXPOSE 8080
COPY /target/DanPizza.jar DanPizza.jar
ENTRYPOINT [ "java", "-jar", "DanPizza.jar"]