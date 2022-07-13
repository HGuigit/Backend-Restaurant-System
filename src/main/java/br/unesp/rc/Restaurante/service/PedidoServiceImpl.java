package br.unesp.rc.Restaurante.service;

import br.unesp.rc.Restaurante.model.Pedido;
import br.unesp.rc.Restaurante.repository.PedidoRepo;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Data
@RequiredArgsConstructor
@Transactional
@Slf4j
public class PedidoServiceImpl implements PedidoService{

    private final PedidoRepo pedidoRepo;

    @Override
    public Pedido savePedido(Pedido pedido) {
        return pedidoRepo.save(pedido);
    }

    @Override
    public Pedido getPedidoById(int idPedido) {
        Pedido pedido = pedidoRepo.findById(idPedido);
        return pedido;
    }

    @Override
    public List<Pedido> getAllPedidos() {
        List<Pedido> pedidos = pedidoRepo.findAll();
        return pedidos;
    }

    @Override
    public List<Pedido> getPedidosComanda(int idComanda) {
        List<Pedido> pedidos = pedidoRepo.findByComanda(idComanda);
        return pedidos;
    }

    @Override
    public List<Pedido> getPedidosFunc(int idFuncionario) {
        List<Pedido> pedidos = pedidoRepo.findByFuncionarioId(idFuncionario);
        return pedidos;
    }


}