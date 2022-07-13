package br.unesp.rc.Restaurante.model;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/*
@author Guilherme on 12/07/2022.
@project Restaurante
*/
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Receita {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int idReceita;
    @NotNull
    @Column(nullable = false)
    private String nome;
    @NotNull
    private float TempoPreparoSeg;
    @NotNull
    private float Preco;
    @NotNull
    @Column(nullable = false)
    private String URL;
    @ManyToMany(fetch = FetchType.EAGER)
    private Collection<Ingrediente> ingredientes = new ArrayList<>();

}
