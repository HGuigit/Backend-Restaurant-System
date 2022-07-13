package br.unesp.rc.Restaurante.service;

import br.unesp.rc.Restaurante.model.Ingrediente;

import java.util.List;

public interface IngredienteService {

    List<Ingrediente> getAllIngredientes();
    Ingrediente getIngredienteByNome();

}
