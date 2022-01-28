package br.com.alistese.alistese.model;

import lombok.*;

import javax.persistence.*;
import java.util.Calendar;

@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Soldado {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) @Getter
    private Integer id;
    @Getter @Setter @Column
    private String nome;
    @Getter @Setter @Column
    private String nascimento;
    @Getter @Setter @Column
    private String rg;
    @Getter @Setter @Column
    private String cpf;
    @Getter @Setter @Column
    private String rua;
    @Getter @Setter @Column
    private String numero;
    @Getter @Setter @Column
    private String bairro;
    @Getter @Setter @Column
    private String cidade;
    @Getter @Setter @Column
    private String estado;
    @Getter @Setter @Column
    private String celular;
    @Getter @Setter @Column
    private String telefoneEmergencia;
    @Getter @Setter @Column
    private String nomeEmergencia;
    @Getter @Setter @Column
private String email;
}
