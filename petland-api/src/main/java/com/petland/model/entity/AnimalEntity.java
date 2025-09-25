package com.petland.model.entity;

import com.petland.model.Especie;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "tab_animal")
@Data
public class AnimalEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter()
    private Integer id;

    @Column(length = 40, nullable = false)
    private String nome;

    private LocalDate aniversario;

    @Enumerated(EnumType.STRING)
    private Especie especie;

    @Column(name = "cad_tutor")
    private Integer tutor;
}
