package com.pucrs.pastfmicro.demo.infrastructure.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.pucrs.pastfmicro.demo.aplication.port.localidade.LocalidadeGateway;
import com.pucrs.pastfmicro.demo.aplication.usecase.localidade.GetLocalidadeByCepUseCase;
import com.pucrs.pastfmicro.demo.infrastructure.persistence.gateway.LocalidadeGatewayImpl;
import com.pucrs.pastfmicro.demo.infrastructure.persistence.repository.LocalidadeRepository;

@Configuration
public class BeanConfiguration {

    @Bean
    GetLocalidadeByCepUseCase getLocalidadeByCepUseCase(LocalidadeGateway localidadeGateway) {
        return new GetLocalidadeByCepUseCase(localidadeGateway);
    }

    @Bean
    LocalidadeGateway getLocalidadeGateway(LocalidadeRepository localidadeRepository) {
        return new LocalidadeGatewayImpl(localidadeRepository);
    }
}
