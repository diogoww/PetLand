package com.petland.repository;

import com.petland.model.entity.CadastroEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CadastroRepository extends JpaRepository<CadastroEntity, Integer> {
}
