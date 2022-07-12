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
import java.util.Date;

import static javax.persistence.GenerationType.AUTO;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Usuario {
    @Id
    @GeneratedValue(strategy = AUTO)
    private int idUsuario;
    @NotNull
    @Column( nullable = false )
    private String username;
    @NotNull
    @Column( nullable = false )
    private String senha;
    @NotNull
    private boolean isFuncionario;
    @OneToOne
    @JoinColumn(name = "idFuncionario")
    private Funcionario funcionarioId;
}
