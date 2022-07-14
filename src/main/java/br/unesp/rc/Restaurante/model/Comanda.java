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
public class Comanda {

    @Id @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int idComanda;

    @NotNull
    private String comandaCode;


}
