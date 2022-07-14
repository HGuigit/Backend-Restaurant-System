package br.unesp.rc.Restaurante.model;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import java.util.Date;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Funcionario {

    @Id @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int idFuncionario;
    @NotNull
    private String CPF;
    @NotNull
    private String CarteiraTrabalho;
    @NotNull
    private float Salario;
    @NotNull
    private Date dataContratacao;
    @NotNull
    private String ocupacao;

}