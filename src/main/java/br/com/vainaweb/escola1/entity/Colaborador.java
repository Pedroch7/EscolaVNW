package br.com.vainaweb.escola1.entity;

import br.com.vainaweb.escola1.enumation.Cargo;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "colaborador")
public class Colaborador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @NotBlank
    @Column(name = "nome")
    private String nome;

    @NotBlank
    @Column(name = "email")
    private String email;

    @NotBlank
    @Column(name = "cpf")
    private String cpf;

   @NotNull
    @Enumerated(EnumType.ORDINAL)
    @Column(name = "cargo")
    private Cargo cargo;

   @OneToOne (mappedBy = "colaborador", cascade = CascadeType.ALL )

   private Endereco endereco;

}
