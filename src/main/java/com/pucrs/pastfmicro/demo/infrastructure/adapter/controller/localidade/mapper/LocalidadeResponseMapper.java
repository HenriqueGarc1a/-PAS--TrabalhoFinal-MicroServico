package com.pucrs.pastfmicro.demo.infrastructure.adapter.controller.localidade.mapper;

import com.pucrs.pastfmicro.demo.aplication.model.localidade.LocalidadeDto;
import com.pucrs.pastfmicro.demo.infrastructure.adapter.controller.localidade.response.LocalidadeResponse;

public final class LocalidadeResponseMapper {

    private LocalidadeResponseMapper() {
    }

    public static LocalidadeResponse fromDto(LocalidadeDto localidade) {
        return new LocalidadeResponse(
                localidade.cep(),
                localidade.nome_localidade(),
                localidade.quantidade_eleitores(),
                localidade.tipo_localidade()
        );
    }
}
