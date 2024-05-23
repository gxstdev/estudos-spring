package com.spring.estudos.gerais.domain.dto;

import com.spring.estudos.gerais.domain.Debut;
import lombok.Data;

import java.util.List;

@Data
public class NarutoDto {
    private String name;
    private List<String> jutsu;
    private Debut debut;
}
