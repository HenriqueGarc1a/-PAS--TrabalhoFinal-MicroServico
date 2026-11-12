package com.pucrs.pastfmicro.demo.aplication.usecase.localidade;

import com.pucrs.pastfmicro.demo.aplication.mapper.localidade.LocalidadeMapper;
import com.pucrs.pastfmicro.demo.aplication.model.localidade.LocalidadeDto;
import com.pucrs.pastfmicro.demo.aplication.port.localidade.LocalidadeGateway;

public class GetLocalidadeByCepUseCase{

    private LocalidadeGateway localidadeGateway;

    public LocalidadeDto execute(String cep){

        return LocalidadeMapper.toDto(this.localidadeGateway.getByCep(cep));

    }
    
}
