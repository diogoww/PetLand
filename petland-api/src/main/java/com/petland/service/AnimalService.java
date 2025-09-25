package com.petland.service;

import com.petland.model.dto.AnimalResponse;
import com.petland.model.entity.AnimalEntity;
import com.petland.repository.AnimalRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AnimalService {

    @Autowired
    private AnimalRepository repository;

    public List<AnimalResponse> listar(){
        List<AnimalEntity> entities = repository.findAll();
        List<AnimalResponse> response = new ArrayList<>();
        for (AnimalEntity e: entities){
            AnimalResponse res = new AnimalResponse();
            BeanUtils.copyProperties(e, res);
            response.add(res);
        }
        return response;
    }
}
