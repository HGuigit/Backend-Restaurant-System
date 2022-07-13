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
    @Column( nullable = false )
    private String CPF;

    @NotNull
    @Column( nullable = false )
    private String CarteiraTrabalho;

    @Column( nullable = false )
    @NotNull
    private float Salario;

    @Column( nullable = false )
    @NotNull
    private Date dataContratacao;

    @Column( nullable = false )
    @NotNull
    private String ocupacao;

}