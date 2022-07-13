package br.unesp.rc.Restaurante.repository;

import br.unesp.rc.Restaurante.model.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FuncionarioRepo extends JpaRepository<Funcionario, Integer> {
    Funcionario findById(int idFuncionario); 
}