package com.petland.start;

import com.petland.model.Cadastro;
import com.petland.repository.CadastroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class StartApp implements ApplicationRunner {

    @Autowired
    private CadastroRepository repository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Cadastro diogo = new Cadastro();
        diogo.setId(1);
        diogo.setNome("Diogo Varaschin");
        repository.save(diogo);
    }
}
