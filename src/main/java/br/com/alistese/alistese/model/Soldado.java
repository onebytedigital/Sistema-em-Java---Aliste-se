package br.com.alistese.alistese.model;

import lombok.*;
import javax.persistence.*;
import javax.validation.Valid;

@ToString
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Soldado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private String nascimento;
    private String rg;
    private String cpf;
    private String rua;
    private String numero;
    private String bairro;
    private String cidade;
    private String estado;
    private String celular;
    private String telefoneEmergencia;
    private String nomeEmergencia;
    private String email;
    private String pago;
    @ManyToOne
    private Pelotao pelotao;
}
