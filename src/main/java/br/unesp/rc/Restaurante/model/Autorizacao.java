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
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Autorizacao {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idAutorizacao;

    @NotNull
    @Column( nullable = false )
    private String nome;

    @ManyToMany
    @JoinTable(
            name = "Permissao",
            joinColumns = @JoinColumn(name = "idAutorizacao"),
            inverseJoinColumns = @JoinColumn(name = "idUsuario")
    )
    private List<Usuario> usuarios;
}