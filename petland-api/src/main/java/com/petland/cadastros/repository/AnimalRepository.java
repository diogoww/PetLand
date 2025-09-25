package com.petland.cadastros.repository;

import com.petland.cadastros.model.entity.AnimalEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnimalRepository extends JpaRepository<AnimalEntity, Integer> {
}
