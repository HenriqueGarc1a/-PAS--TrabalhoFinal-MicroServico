package com.pucrs.pastfmicro.demo.aplication.model.localidade;

import com.pucrs.pastfmicro.demo.domain.enums.TipoLocalidade;

public record LocalidadeDto(
        String cep,
        String nome_localidade,
        long quantidade_eleitores,
        TipoLocalidade tipo_localidade
) {
}
