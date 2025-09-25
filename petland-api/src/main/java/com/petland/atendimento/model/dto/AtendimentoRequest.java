package com.petland.atendimento.model.dto;

import com.petland.atendimento.model.AtendimentoStatus;
import com.petland.atendimento.model.AtendimentoTipo;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

import java.time.LocalDate;

@Data
public class AtendimentoRequest {

    private Integer id;
    private String descricao;
    private LocalDate data;
    private Double valor;
    private boolean emergencia;

    private AtendimentoTipo tipo;
    private AtendimentoStatus status;

    private Integer animal;
    private Integer produtoServico;
    private Integer cadastro;
}
