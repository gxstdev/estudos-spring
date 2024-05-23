package com.spring.estudos.gerais.external;

import com.spring.estudos.gerais.domain.dto.AllCharactersNarutoResponse;
import com.spring.estudos.gerais.domain.dto.NarutoDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Service
@FeignClient(name = "NarutoFeign", url = "https://narutodb.xyz/api")
public interface NarutoFeignApi {

    @GetMapping(value = "/character/{id}")
    NarutoDto getPersonagem(@PathVariable("id") Integer id);

    @GetMapping(value = "/character")
    AllCharactersNarutoResponse getAllPersonagens();

    @GetMapping(value = "/character/search?name={name}")
    NarutoDto getPersonagemByName(@PathVariable String name);
}
