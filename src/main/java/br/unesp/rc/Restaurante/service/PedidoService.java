package br.unesp.rc.Restaurante.service;

/*
@author Guilherme on 13/07/2022.
@project Restaurante
*/

import br.unesp.rc.Restaurante.model.Pedido;

import java.util.List;

public interface PedidoService {

    Pedido getPedidoById(int idPedido);
    List<Pedido> getAllPedidos();
    List<Pedido> getPedidosComanda(int idComanda);
    List<Pedido> getPedidosFunc(int idFuncionario);
    Pedido savePedido(Pedido pedido);

}
