package br.unesp.rc.Restaurante.model;

/*
@author Guilherme on 11/07/2022.
@project Restaurante
*/


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Autorizacao {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idAutorizacao;
    private String nome;
}
