package com.pucrs.pastfmicro.demo.infrastructure.persistence.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "localidades")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LocalidadeEntity {

    @Id
    private String cep;

    private String nome;

    private long qtdEleitores;

    @Enumerated(EnumType.STRING)
    private TipoLocalidadeEntity tipo;
}
