package com.exepciones.exepciones.controlador;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/division")
public class Operaciones {
    @GetMapping
    public String divide(@RequestParam String numero){
        try {
            int valor = Integer.parseInt(numero);
            int resultado = 20 / valor;
            return "El resultado es: " + resultado;
        }catch (NumberFormatException ERROR){
            return "Error: el valor ingresado " + numero + " no es un número";
        }catch (ArithmeticException ERROR){
            return "NO se puede dividir entre 0";
        }
    }
}
