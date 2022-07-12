package br.unesp.rc.Restaurante.model;

/*
@author Guilherme on 11/07/2022.
@project Restaurante
*/

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import java.util.Date;

import static javax.persistence.GenerationType.AUTO;

public class Usuario {
    @Id
    @GeneratedValue(strategy = AUTO)
    private int idUsuario;
    private String username;
    private String senha;
    private boolean isFuncionario;
    @OneToOne

}
