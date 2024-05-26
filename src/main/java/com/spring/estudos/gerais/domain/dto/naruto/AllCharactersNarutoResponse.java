package com.spring.estudos.gerais.domain.dto.naruto;

import lombok.Data;

import java.util.List;

@Data
public class AllCharactersNarutoResponse {
    private List<NarutoDto> characters;
}
