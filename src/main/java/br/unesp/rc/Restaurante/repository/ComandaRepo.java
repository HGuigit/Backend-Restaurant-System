package br.unesp.rc.Restaurante.repository;

import br.unesp.rc.Restaurante.model.Comanda;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComandaRepo extends JpaRepository<Comanda, Integer> {
    Receita findById(int idComanda); 
}