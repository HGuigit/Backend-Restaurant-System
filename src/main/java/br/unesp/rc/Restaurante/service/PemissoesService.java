package br.unesp.rc.Restaurante.service;

import br.unesp.rc.Restaurante.model.Permissao;

import java.util.List;

public interface PermissaoService {

    List<Permissao> getAllPermissoes();
    Ingrediente getPermissaoById();

}
