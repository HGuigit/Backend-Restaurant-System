package br.unesp.rc.Restaurante.repository;

import br.unesp.rc.Restaurante.model.Receita;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ReceitaRepo extends JpaRepository<Receita, Integer> {
    Receita findById(int idReceita);
    Receita findByNome(String nome);
}
