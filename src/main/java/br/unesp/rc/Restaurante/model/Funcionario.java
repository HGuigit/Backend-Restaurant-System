package br.unesp.rc.usersevice.model;

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
    private String CPF;
    private String CarteiraTrabalho;
    private float Salario;
    private Date dataContratacao;
    float salario;
}