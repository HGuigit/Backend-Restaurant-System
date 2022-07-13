package br.unesp.rc.Restaurante.repository;

import br.unesp.rc.Restaurante.model.Ingrediente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IngredienteRepo extends JpaRepository<Ingrediente, Integer> {
    Ingrediente findById(int idIngrediente);
    Ingrediente findByNome(String nome);
}