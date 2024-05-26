package com.spring.estudos.gerais.mapper;

import com.spring.estudos.gerais.domain.dto.professor.ProfessorDto;
import com.spring.estudos.gerais.domain.entities.Professor;

public class ProfessorMapper {
    public static Professor toEntity(ProfessorDto dto){
        return Professor.builder()
                .nome(dto.getNome())
                .departamento(dto.getDepartamento())
                .nivel(dto.getNivel())
                .build();
    }
}
