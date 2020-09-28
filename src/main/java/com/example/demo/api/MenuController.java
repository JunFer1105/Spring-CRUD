package com.example.demo.api;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping
@RestController
public class MenuController {

    private String pagina_inicio="<html><head><title>Spring servicio</title></head><body>" +
            "<center><h1>API en Java Spring</h1><p>Esta api implementa los servicios de CRUD de una persona</p>" +
            "<h4>-- api/v1/person --</h4>" +
            "<br><p>POST: body(json) - name   Crea un nuevo registro de persona</p>" +
            "<p>GET:    Lista la informacion de todas las personas</p>" +
            "<p>PUT: params - id   Modifica el nombre de la persona del id</p>" +
            "<p>DELETE: params - id   Elimina el registro de la persona del id</p>" +
            " <footer>\n" +
            "  <p>Author: Juan Fernando Arango</p>\n" +
            "  <p><a href=\"https://github.com/JunFer1105/Spring-CRUD\">Repositorio</a></p>\n" +
            "</footer></center>" +
            "</body></html>";

    @GetMapping("/")
    public String home() {
        return String.format(pagina_inicio);
    }
}
