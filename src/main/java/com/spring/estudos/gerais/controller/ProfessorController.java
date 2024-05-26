package com.spring.estudos.gerais.controller;

import com.spring.estudos.gerais.domain.dto.professor.ProfessorDto;
import com.spring.estudos.gerais.domain.entities.Professor;
import com.spring.estudos.gerais.service.ProfessorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/professor")
public class ProfessorController {
    @Autowired
    private ProfessorService professorService;

    @PostMapping
    public Professor postProfessor(@RequestBody ProfessorDto dto){
        return professorService.cadastrar(dto);
    }
}
