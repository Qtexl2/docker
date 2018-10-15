FROM java:8
EXPOSE 8080
RUN mkdir -p app
ADD build/libs/socket-0.0.1.jar app/socket-0.0.1.jar
ENV GRADLE_HOME /opt/gradle-4.2.1
ENV PATH $PATH:/opt/gradle-4.2.1/bin
RUN gradle build
ENTRYPOINT ["java", "-jar", "app/socket-0.0.1.jar"]