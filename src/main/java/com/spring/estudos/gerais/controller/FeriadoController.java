package com.spring.estudos.gerais.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/feriados")
public class FeriadoController {

    @GetMapping
    public ResponseEntity<String> getMsg(){
        return ResponseEntity.ok("Teste");
    }

    @PostMapping
    public ResponseEntity<Teste> postMsg(@RequestBody Teste teste){
        return ResponseEntity.ok(teste);
    }
}
