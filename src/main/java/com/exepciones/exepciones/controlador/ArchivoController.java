package com.exepciones.exepciones.controlador;


import com.exepciones.exepciones.servicios.FileContentServices;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/archivo")
public class ArchivoController {
    private final FileContentServices contentServices;

    public ArchivoController(FileContentServices contentServices){
        this.contentServices = contentServices;
    }

    @GetMapping("/lectura")
    public ResponseEntity<String> lectura(@RequestParam String ruta){
        try{
            String elArchivo = contentServices.lecturaArchivo(ruta);
            return ResponseEntity.ok(elArchivo);
        }catch (RuntimeException ERROR){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Error en lectura de archivo: " + ERROR);
        }
    }

}
