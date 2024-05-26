package com.spring.estudos.gerais.controller;

import com.spring.estudos.gerais.domain.dto.naruto.AllCharactersNarutoResponse;
import com.spring.estudos.gerais.domain.dto.naruto.NarutoDto;
import com.spring.estudos.gerais.external.NarutoFeignApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/naruto")
public class NarutoController {
    @Autowired
    private NarutoFeignApi feignApi;

    @GetMapping("/{id}")
    public ResponseEntity<NarutoDto> getPersonagem(@PathVariable("id") Integer id){
        return ResponseEntity.ok(feignApi.getPersonagem(id));
    }

    @GetMapping
    public ResponseEntity<List<NarutoDto>> getAllPersonagens(){
        AllCharactersNarutoResponse o = feignApi.getAllPersonagens();
        return ResponseEntity.ok(o.getCharacters());
    }
    @GetMapping("/nome/{name}")
    public ResponseEntity<NarutoDto> getPersonagemByName(@PathVariable String name){
        return ResponseEntity.ok(feignApi.getPersonagemByName(name));
    }
}
