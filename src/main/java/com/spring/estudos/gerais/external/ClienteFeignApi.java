package com.spring.estudos.gerais.external;

import com.spring.estudos.gerais.domain.dto.ClienteDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Service
@FeignClient(value = "ClienteFeign", url = "http://localhost:8081/cliente")
public interface ClienteFeignApi {

    @PostMapping(value = "/cadastrar")
    ClienteDto cadastrar(@RequestBody ClienteDto dto);
}
