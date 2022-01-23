FROM azul/zulu-openjdk:8
COPY target/game-high-score.jar game-high-score.jar
EXPOSE 8080
CMD ["java","-Xms1024m","-Xmx2048m", "-jar","/game-high-score.jar"]