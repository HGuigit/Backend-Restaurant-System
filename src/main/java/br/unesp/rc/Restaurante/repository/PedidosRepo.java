package br.unesp.rc.Restaurante.repository;

import br.unesp.rc.Restaurante.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepo extends JpaRepository<Ingrediente, Integer> {
    Ingrediente findById(int idPedido); 
}