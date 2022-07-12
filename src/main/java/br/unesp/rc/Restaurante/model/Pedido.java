package br.unesp.rc.Restaurante.model;

/*
@author Guilherme on 12/07/2022.
@project Restaurante
*/

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idPedido;

    @NotNull
    private float valorTotal;

    @NotNull
    @Column( nullable = false )
    private Date DataHora;

    @NotNull
    @OneToOne
    @JoinColumn(name = "idFuncionario")
    private Funcionario funcionarioId;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "idComanda")
    private Comanda comanda;


}
