package br.unesp.rc.Restaurante.service;

import br.unesp.rc.Restaurante.model.Usuario;

import java.util.List;

public interface UsuarioService {

    List<Usuario> getAllUsuarios();
    Ingrediente getUsuarioById();

}
