package com.dg.curriculo.model;

import jakarta.persistence.*;

@Entity
public class Formacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String curso;
    private String instituicao;
    private String conclusao;

    @ManyToOne
    @JoinColumn(name = "curriculo_id")
    private Curriculo curriculo;

}
