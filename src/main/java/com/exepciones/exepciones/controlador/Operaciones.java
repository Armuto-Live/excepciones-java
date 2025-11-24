package com.exepciones.exepciones.controlador;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/division")
public class Operaciones {
    @GetMapping
    public String divide(){
        int valor = 20/0;
        return "Resultado: "+ valor;
    }


}
