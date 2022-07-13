package br.unesp.rc.Restaurante.repository;

import br.unesp.rc.Restaurante.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepo extends JpaRepository<Usuario, Integer> {
    Usuario findById(int idUsuario); 
    Usuario findByUsername(String username); 
}