package com.example.spring_maven; // Doit correspondre à ton dossier [cite: 92]

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController // Ajouté pour créer le contrôleur REST [cite: 8, 92]
public class SpringMavenApplication { // LE NOM DOIT ÊTRE IDENTIQUE AU FICHIER

    public static void main(String[] args) {
        SpringApplication.run(SpringMavenApplication.class, args);
    }

    @GetMapping("/hello") // L'URL pour le test [cite: 91]
    public String sayHello() {
        return "Hello, World!"; // Le message de retour [cite: 91]
    }
}