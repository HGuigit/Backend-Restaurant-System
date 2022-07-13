package br.unesp.rc.Restaurante.service;

import br.unesp.rc.Restaurante.model.Funcionario;

import java.util.List;

public interface FuncionarioService {

    List<Funcionario> getAllFuncionarios();
    Ingrediente getFuncionarioById();

}
