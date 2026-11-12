package com.pucrs.pastfmicro.demo.infrastructure.adapter.controller.localidade.response;

import com.pucrs.pastfmicro.demo.domain.enums.TipoLocalidade;

public record LocalidadeResponse(
        String cep,
        String nome_localidade,
        long quantidade_eleitores,
        TipoLocalidade tipo_localidade
) {
}
