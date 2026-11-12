package com.pucrs.pastfmicro.demo.aplication.port.localidade;

import com.pucrs.pastfmicro.demo.domain.Localidade;

public interface LocalidadeGateway {

    Localidade getByCep(String cep);
    
}
