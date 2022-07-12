package br.unesp.rc.Restaurante.model;

/*
@author Guilherme on 12/07/2022.
@project Restaurante
*/

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

import javax.persistence.JoinColumn;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Ingrediente {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idIngrediente;

    @NotNull
    @Column( nullable = false )
    private String Nome;

    @ManyToMany
    @JoinTable(
            name = "IngredientesReceitas",
            joinColumns = @JoinColumn(name = "idIngrediente"),
            inverseJoinColumns = @JoinColumn(name = "idReceita")
    )
    private List<Receitas> receitas;


}
