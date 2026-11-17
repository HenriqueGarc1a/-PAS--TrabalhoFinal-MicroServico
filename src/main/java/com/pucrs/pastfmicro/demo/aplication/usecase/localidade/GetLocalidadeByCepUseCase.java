package com.pucrs.pastfmicro.demo.aplication.usecase.localidade;

import com.pucrs.pastfmicro.demo.aplication.mapper.localidade.LocalidadeMapper;
import com.pucrs.pastfmicro.demo.aplication.model.localidade.LocalidadeDto;
import com.pucrs.pastfmicro.demo.aplication.port.localidade.LocalidadeGateway;
import com.pucrs.pastfmicro.demo.domain.Localidade;

public class GetLocalidadeByCepUseCase{

    private final LocalidadeGateway localidadeGateway;

    public GetLocalidadeByCepUseCase(LocalidadeGateway localidadeGateway) {
        this.localidadeGateway = localidadeGateway;
    }

    public LocalidadeDto execute(String cep){

        Localidade localidade = this.localidadeGateway.getByCep(cep).orElseThrow();

        return LocalidadeMapper.toDto(localidade);

    }
    
}
