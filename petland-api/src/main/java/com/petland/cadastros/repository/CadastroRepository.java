package com.petland.cadastros.repository;

import com.petland.cadastros.model.entity.CadastroEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CadastroRepository extends JpaRepository<CadastroEntity, Integer> {
}
