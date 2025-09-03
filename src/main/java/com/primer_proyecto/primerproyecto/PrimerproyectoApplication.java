package com.primer_proyecto.primerproyecto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class PrimerproyectoApplication {

    public static void main(String[] args) {
        SpringApplication.run(PrimerproyectoApplication.class, args);
    }
}

@RestController
class HolaController {

    @GetMapping("/hola")
    public String hola() {
        return "¡Hola, Spring Boot funcionando!";
    }
}
