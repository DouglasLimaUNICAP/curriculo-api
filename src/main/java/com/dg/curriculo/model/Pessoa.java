package com.dg.curriculo.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Pessoa {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String email;
    private String telefone;
    private String resumo;

    // getters e setters
}
