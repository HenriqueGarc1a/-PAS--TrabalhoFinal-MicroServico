package com.pucrs.pastfmicro.demo.domain;

import com.pucrs.pastfmicro.demo.domain.enums.TipoLocalidade;

import lombok.Getter;
import lombok.AllArgsConstructor;

@Getter
@AllArgsConstructor
public class Localidade {

    private String cep;
    private String nome;
    private long   qtdEleitores;
    private TipoLocalidade tipo;
   
}
