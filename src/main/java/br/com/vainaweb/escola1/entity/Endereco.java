package br.com.vainaweb.escola1.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Entity
@Table (name = "endereco")

public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @NotBlank
    @Column(name = "cep")
    private String cep;

    @NotBlank
    @Column(name = "rua")
    private String rua;

    @NotBlank
    @Column(name = "bairro")
    private String bairro;

    @NotBlank
    @Column(name = "cidade")
    private String cidade;

    @OneToOne (cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })

    @JoinColumn (name = "colaborador_id")

    private Colaborador colaborador;

}

