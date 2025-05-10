package org.example.exampledespliegue.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EjemploController {
    @GetMapping("/hello")
    public String mensaje(){
        return  "hello world peru profundo!!!";
    }
}
