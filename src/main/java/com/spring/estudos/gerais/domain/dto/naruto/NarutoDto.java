package com.spring.estudos.gerais.domain.dto.naruto;

import lombok.Data;

import java.util.List;

@Data
public class NarutoDto {
    private String name;
    private List<String> jutsu;
    private Debut debut;
}
