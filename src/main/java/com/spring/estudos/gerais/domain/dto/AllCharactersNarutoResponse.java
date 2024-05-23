package com.spring.estudos.gerais.domain.dto;

import lombok.Data;

import java.util.List;

@Data
public class AllCharactersNarutoResponse {
    private List<NarutoDto> characters;
}
