package br.unesp.rc.Restaurante.repository;

/*
@author Guilherme on 13/07/2022.
@project Restaurante
*/

import br.unesp.rc.Restaurante.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PedidoRepo extends JpaRepository<Pedido, Integer> {

    Pedido findById(int idPedido);
    List<Pedido> findByComanda(int comandaId);
    List<Pedido> findByFuncionarioId(int idFuncionario);
}
