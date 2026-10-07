FROM eclipse-temurin:25

RUN mkdir /opt/app

COPY /target/gym-progress-0.0.2-SNAPSHOT.jar /opt/app

CMD ["java", "-jar" "opt/app/gym-progress-0.0.2-SNAPSHOT.jar"]