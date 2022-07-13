package br.unesp.rc.Restaurante.repository;

import br.unesp.rc.Restaurante.model.Permissoes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PermissoesRepo extends JpaRepository<Permissoes, Integer> {
    Permissoes findById(int idPermissoes); 
}