package br.unesp.rc.Restaurante.service;

import br.unesp.rc.Restaurante.model.Pedido;

import java.util.List;

public interface PedidoService {

    List<Pedido> getAllPedidos();
    Ingrediente getPedidoById();

}
