package com.pucrs.pastfmicro.demo.aplication.mapper.localidade;

import com.pucrs.pastfmicro.demo.aplication.model.localidade.LocalidadeDto;
import com.pucrs.pastfmicro.demo.domain.Localidade;

public class LocalidadeMapper {

    public static LocalidadeDto toDto(Localidade localidade){
        return new LocalidadeDto(
                localidade.getCep(),
                localidade.getNome(),
                localidade.getQtdEleitores(),
                localidade.getTipo()
        );
    }
}
