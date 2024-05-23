package com.spring.estudos.gerais.controller;

import com.spring.estudos.gerais.domain.dto.ClienteDto;
import com.spring.estudos.gerais.domain.dto.ClienteDtoResponse;
import com.spring.estudos.gerais.external.ClienteFeignApi;
import com.spring.estudos.gerais.mappers.ClienteMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
    @Autowired
    ClienteFeignApi clienteFeignApi;

    @PostMapping("/cadastrar")
    public ResponseEntity<ClienteDtoResponse> postCliente(@RequestBody ClienteDto dto){
        return ResponseEntity.ok(
                ClienteMapper
                        .toDtoResponse(clienteFeignApi.cadastrar(dto)));
    }
}
