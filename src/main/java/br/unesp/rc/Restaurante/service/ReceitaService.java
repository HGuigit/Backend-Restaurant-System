package br.unesp.rc.Restaurante.service;

/*
@author Guilherme on 12/07/2022.
@project Restaurante
*/

import br.unesp.rc.Restaurante.model.Receita;

import java.util.List;

public interface ReceitaService {

    Receita saveReceita(Receita receita);
    List<Receita> getAllReceitas();
    Receita getReceitaByNome(String nome);

}
