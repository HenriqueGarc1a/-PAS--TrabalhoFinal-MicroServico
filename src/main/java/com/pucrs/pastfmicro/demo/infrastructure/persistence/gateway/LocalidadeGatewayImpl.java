package com.pucrs.pastfmicro.demo.infrastructure.persistence.gateway;

import java.util.Optional;

import com.pucrs.pastfmicro.demo.aplication.port.localidade.LocalidadeGateway;
import com.pucrs.pastfmicro.demo.domain.Localidade;
import com.pucrs.pastfmicro.demo.domain.enums.TipoLocalidade;
import com.pucrs.pastfmicro.demo.infrastructure.persistence.repository.LocalidadeRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor 
public class LocalidadeGatewayImpl implements LocalidadeGateway {

    LocalidadeRepository repository;

    @Override
    public Optional<Localidade> getByCep(String cep) {

        return repository.findById(cep)
                .map(entity -> new Localidade(
                        entity.getCep(),
                        entity.getNome(),
                        entity.getQtdEleitores(),
                        TipoLocalidade.valueOf(entity.getTipo().name())
                ));
    }
    
}
