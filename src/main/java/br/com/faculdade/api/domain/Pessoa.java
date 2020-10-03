package br.com.faculdade.api.domain;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "PESSOA")
public class Pessoa {

    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CODIGO")
    private Long codigo;

    @Size(max = 50)
    @Column(name = "NOME")
    private String nome;

    @Size(max = 12)
    @NonNull
    @Column(name = "CPF")
    private String CPF;

    @Column(name = "DATA_NASCIMENTO")
    private String dataNascimento;
}
