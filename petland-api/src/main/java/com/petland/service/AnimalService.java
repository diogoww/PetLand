package com.petland.service;

import com.petland.model.entity.AnimalEntity;
import com.petland.repository.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimalService {

    @Autowired
    private AnimalRepository repository;

    public List<AnimalEntity> listar(){
        return repository.findAll();
    }
}
