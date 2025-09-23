package com.petland.start;

import com.petland.model.Cadastro;
import com.petland.model.Endereco;
import com.petland.model.Perfil;
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

        Cadastro pessoa = new Cadastro();
        pessoa.setNome("Diogow Varaschin");
        Perfil perfil = new Perfil();
        perfil.setCliente(true);
        pessoa.setPerfil(perfil);

        Endereco endereco = new Endereco();
        endereco.setLogradouro("Rua Lionel Messi");
        endereco.setNumero("10A");
        pessoa.setEndereco(endereco);

        repository.save(pessoa);
    }
}
