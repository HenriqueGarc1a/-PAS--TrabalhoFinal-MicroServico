package com.pucrs.pastfmicro.demo.domain;

import com.pucrs.pastfmicro.demo.domain.enums.TipoLocalidade;

import lombok.Getter;

@Getter 
public class Localidade {

    private String cep;
    private String nome;
    private long   qtdEleitores;
    private TipoLocalidade tipo;
   
}