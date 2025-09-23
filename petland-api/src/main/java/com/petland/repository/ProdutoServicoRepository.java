package com.petland.repository;

import com.petland.model.ProdutoServico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoServicoRepository extends JpaRepository<ProdutoServico, Integer> {
}
