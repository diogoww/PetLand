package com.petland.repository;

import com.petland.model.Cadastro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CadastroRepository extends JpaRepository<Cadastro, Integer> {
}
