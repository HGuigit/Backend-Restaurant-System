package br.unesp.rc.Restaurante.repository;

import br.unesp.rc.Restaurante.model.Autorizacao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AutorizacaoRepo extends JpaRepository<Autorizacao, Integer> {
    Receita findById(int idAutorizacao); 
}