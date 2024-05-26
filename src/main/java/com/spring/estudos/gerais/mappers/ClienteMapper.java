package com.spring.estudos.gerais.mappers;

import com.spring.estudos.gerais.domain.dto.cliente.ClienteDto;
import com.spring.estudos.gerais.domain.dto.cliente.ClienteDtoResponse;

public class ClienteMapper {
    public static ClienteDtoResponse toDtoResponse(ClienteDto dto){
        return ClienteDtoResponse.builder()
                .id(dto.getId())
                .nome(dto.getNome())
                .build();
    }
}
