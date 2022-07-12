package br.unesp.rc.Restaurante.model;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import java.util.Date;

import static javax.persistence.GenerationType.AUTO;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Funcionario {

    @Id @GeneratedValue(strategy = AUTO)
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