package com.pucrs.pastfmicro.demo.infrastructure.adapter.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pucrs.pastfmicro.demo.aplication.usecase.localidade.GetLocalidadeByCepUseCase;
import com.pucrs.pastfmicro.demo.infrastructure.adapter.controller.localidade.mapper.LocalidadeResponseMapper;
import com.pucrs.pastfmicro.demo.infrastructure.adapter.controller.localidade.response.LocalidadeResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping("/consultalocalidade")
public class LocalidadeController {

    private GetLocalidadeByCepUseCase getLocalidadeByCepUseCase;

    @GetMapping("/{cep}")
    public LocalidadeResponse getMethodName(@PathVariable String cep) {
        
        return LocalidadeResponseMapper.fromDto(this.getLocalidadeByCepUseCase.execute(cep));

    }
        
}
