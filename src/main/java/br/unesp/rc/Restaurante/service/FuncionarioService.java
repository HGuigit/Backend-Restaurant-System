package br.unesp.rc.Restaurante.service;

import br.unesp.rc.Restaurante.model.Funcionario;

import java.util.List;

public interface FuncionarioService {

    Funcionario saveFuncionario(Funcionario funcionario);
    List<Funcionario> getAllFuncionarios();
    Funcionario getFuncionarioById(int idFuncionario);

}