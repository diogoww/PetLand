package com.petland.cadastros.model.dto;

import com.petland.cadastros.model.Especie;
import lombok.Data;

import java.time.LocalDate;

@Data
public class AnimalRequest {
    private String nome;
    private LocalDate aniversario;
    private Especie especie;
    private Integer tutor;
}
