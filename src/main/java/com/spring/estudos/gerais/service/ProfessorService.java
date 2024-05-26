package com.spring.estudos.gerais.service;

import com.spring.estudos.gerais.domain.dto.professor.ProfessorDto;
import com.spring.estudos.gerais.domain.entities.Professor;
import com.spring.estudos.gerais.mapper.ProfessorMapper;
import com.spring.estudos.gerais.repository.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProfessorService {

    @Autowired
    private ProfessorRepository professorRepository;

    public Professor cadastrar(ProfessorDto dto){
        Professor p = ProfessorMapper.toEntity(dto);
        return professorRepository.save(p);
    }
}
