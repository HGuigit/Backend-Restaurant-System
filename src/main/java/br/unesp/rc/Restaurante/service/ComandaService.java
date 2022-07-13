package br.unesp.rc.Restaurante.service;

import br.unesp.rc.Restaurante.model.Comanda;

import java.util.List;

public interface ComandaService {

    List<Comanda> getAllComandas();
    Ingrediente getComandaById();

}
