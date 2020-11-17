FROM openjdk:8-jdk-alpine
RUN cd / && mkdir target && chmod 777 -R /target
COPY  ./target/webinar-CICD-2.4.0.jar /target/
EXPOSE 3000
ENTRYPOINT ["java","-jar","/target/webinar-CICD-2.4.0.jar"]
