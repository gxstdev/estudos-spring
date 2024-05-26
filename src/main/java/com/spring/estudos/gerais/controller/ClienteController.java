package com.spring.estudos.gerais.controller;

import com.spring.estudos.gerais.domain.dto.cliente.*;
import com.spring.estudos.gerais.external.ClienteFeignApi;
import com.spring.estudos.gerais.mappers.ClienteMapper;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
    @Autowired
    ClienteFeignApi clienteFeignApi;

    public static String token;

    @PostMapping("/cadastrar")
    public ResponseEntity<ClienteDtoResponse> postCliente(@RequestBody ClienteDto dto){
        return ResponseEntity.ok(
                ClienteMapper
                        .toDtoResponse(clienteFeignApi.cadastrar(dto)));
    }
    @PostMapping("/logar")
    public ResponseEntity<ClienteLoginResponse> postLoginCliente(@RequestBody ClienteLoginDto loginDto){
        ClienteLoginResponse c = clienteFeignApi.logar(loginDto);
        token = c.getToken();
        return ResponseEntity.ok(c);
    }
    @GetMapping
    public ResponseEntity<List<ClienteDtoResponse>> getClientes(){
        return ResponseEntity.ok(clienteFeignApi.visualizar());
    }
    @GetMapping("/{id_cliente}")
    public ResponseEntity<ClienteDtoResponse> getClienteById(@PathVariable("id_cliente") Integer id){
        return ResponseEntity.ok(clienteFeignApi.visualizarPorId(id));
    }
    @DeleteMapping("/{id_cliente}")
    public ResponseEntity<ClienteDtoResponse> deleteClienteById(@PathVariable("id_cliente") Integer id){
        return ResponseEntity.ok(clienteFeignApi.deletarPorId(id));
    }
    @PutMapping("/{id}")
    public ResponseEntity<ClienteDtoResponse> putClienteById(@Valid @RequestBody ClienteUpdateDto dto,
                           @PathVariable("id")  Integer id){
        System.out.println(dto);
        return ResponseEntity.ok(clienteFeignApi.atualizarPorId(dto, id));
    }
}
