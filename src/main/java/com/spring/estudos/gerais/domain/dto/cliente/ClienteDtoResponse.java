package com.spring.estudos.gerais.domain.dto.cliente;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ClienteDtoResponse {
    private Integer id;
    private String nome;
}
