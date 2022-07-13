package br.unesp.rc.Restaurante.service;

/*
@author Guilherme on 12/07/2022.
@project Restaurante
*/

import br.unesp.rc.Restaurante.model.Comanda;

import java.util.List;

public interface ComandaService {

    Comanda saveComanda(Comanda comanda);
    List<Comanda> getAllComandas();
    Comanda getComandaById(int idComanda);

}