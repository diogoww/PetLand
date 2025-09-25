package com.petland.model.dto;

import com.petland.model.Especie;
import lombok.Data;

import java.time.LocalDate;

@Data
public class AnimalResponse {
    private Integer id;
    private String nome;
    private LocalDate aniversario;
    private Especie especie;
}
