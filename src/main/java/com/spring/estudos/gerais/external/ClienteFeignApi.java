package com.spring.estudos.gerais.external;

import com.spring.estudos.gerais.config.FeignConfig;
import com.spring.estudos.gerais.domain.dto.cliente.*;
import jakarta.validation.Valid;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Service
@FeignClient(value = "ClienteFeign", url = "http://localhost:8081/cliente",
        configuration = FeignConfig.class)
public interface ClienteFeignApi {


    @PostMapping(value = "/cadastrar")
    ClienteDto cadastrar(@RequestBody ClienteDto dto);

    @PostMapping(value = "/logar")
    ClienteLoginResponse logar(@RequestBody ClienteLoginDto loginDto);

    @GetMapping
    List<ClienteDtoResponse> visualizar();

    @GetMapping(value = "/{id_cliente}")
    ClienteDtoResponse visualizarPorId(@PathVariable("id_cliente") Integer id);

    @DeleteMapping(value = "/{id_cliente}")
    ClienteDtoResponse deletarPorId(@PathVariable("id_cliente") Integer id);

    @PutMapping(value = "/{id}")
    ClienteDtoResponse atualizarPorId(@Valid @RequestBody ClienteUpdateDto dto, @PathVariable("id") Integer id);
}
