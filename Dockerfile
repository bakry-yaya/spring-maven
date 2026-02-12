# Utilise Java 17 (conforme à ton projet)
FROM eclipse-temurin:17-jdk

# Dossier de travail dans l'image
WORKDIR /app

# Copie le JAR que tu as généré avec ton "BUILD SUCCESS"
# Le nom doit correspondre à ce qu'il y a dans ton dossier target/
COPY target/*.jar app.jar

# Port exposé par Spring Boot
EXPOSE 8080

# Commande de lancement
ENTRYPOINT ["java", "-jar", "app.jar"]