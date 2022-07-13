package br.unesp.rc.Restaurante.service;

/*
@author Guilherme on 12/07/2022.
@project Restaurante
*/

import br.unesp.rc.Restaurante.model.Usuario;

import java.util.List;

public interface UsuarioService {

    Usuario saveUsuario(Usuario usuario);
    List<Usuario> getAllUsuarios();
    Usuario getUsuarioByUsername(String username);

}