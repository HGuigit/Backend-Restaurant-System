package br.unesp.rc.Restaurante.model;
/*
@author Guilherme on 11/07/2022.
@project Restaurante
*/

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int idUsuario;
    @NotNull
    private String username;
    @NotNull
    private String senha;
    @NotNull
    private boolean isFuncionario;

    @OneToOne
    @JoinColumn(name = "idFuncionario")
    private Funcionario funcionarioId;

    @ManyToMany(fetch = FetchType.EAGER)
    private Collection<Autorizacao> autorizacoes = new ArrayList<>();
}

