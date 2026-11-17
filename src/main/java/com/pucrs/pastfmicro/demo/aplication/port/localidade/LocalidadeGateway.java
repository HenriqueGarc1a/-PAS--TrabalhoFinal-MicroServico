package com.pucrs.pastfmicro.demo.aplication.port.localidade;

import java.util.Optional;

import com.pucrs.pastfmicro.demo.domain.Localidade;

public interface LocalidadeGateway {

    Optional<Localidade> getByCep(String cep);
    
}
