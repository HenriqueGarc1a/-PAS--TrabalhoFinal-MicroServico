package com.pucrs.pastfmicro.demo.infrastructure.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.pucrs.pastfmicro.demo.infrastructure.persistence.entity.LocalidadeEntity;

public interface LocalidadeRepository extends JpaRepository<LocalidadeEntity, String> {
    
}
