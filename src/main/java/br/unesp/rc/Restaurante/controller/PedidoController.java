package br.unesp.rc.Restaurante.controller;

import br.unesp.rc.Restaurante.model.Pedido;
import br.unesp.rc.Restaurante.service.PedidoService;
import br.unesp.rc.Restaurante.service.PedidoServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
@RequestMapping("/pedidos")
@RequiredArgsConstructor
public class PedidoController {

    private final PedidoService pedidoService;

    @GetMapping("/")
    public List<Pedido> getPedido(HttpServletRequest, HttpServletResponse){

    }


}