package com.petland.start;

import com.petland.model.Animal;
import com.petland.model.Especie;
import com.petland.repository.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class StartApp implements ApplicationRunner {

    @Autowired
    private AnimalRepository repository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Animal leona = new Animal();
        leona.setNome("Leona");
        leona.setAniversario(LocalDate.of(2018, 07, 15));
        leona.setEspecie(Especie.CACHORRO);
        repository.save(leona);
    }
}
