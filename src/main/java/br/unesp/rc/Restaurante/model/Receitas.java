package br.unesp.rc.Restaurante.model;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

/*
@author Guilherme on 12/07/2022.
@project Restaurante
*/
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Receitas {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idReceita;
    @NotNull
    private float TempoPreparoSeg;
    @NotNull
    private float Preco;
    @NotNull
    @Column(nullable = false)
    private String URL;
    @ManyToMany
    @JoinTable(
            name = "Itens",
            joinColumns = @JoinColumn(name = "idReceita"),
            inverseJoinColumns = @JoinColumn(name = "idPedido")
    )
    private List<Pedido> pedidos;

}
