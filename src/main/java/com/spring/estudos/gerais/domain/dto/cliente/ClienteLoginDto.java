package com.spring.estudos.gerais.domain.dto.cliente;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ClienteLoginDto {
    private String email;
    private String senha;
}
