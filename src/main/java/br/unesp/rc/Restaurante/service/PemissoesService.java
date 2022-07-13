package br.unesp.rc.Restaurante.service;


import br.unesp.rc.Restaurante.model.Permissoes;

import java.util.List;

public interface PermissoesService {

    Permissoes savePermissoes(Permissoes permissoes);
    List<Permissoes> getAllPermissoess();
    Permissoes getPermissoesById(int idPermissoes);

}