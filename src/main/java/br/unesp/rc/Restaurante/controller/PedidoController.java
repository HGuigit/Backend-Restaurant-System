package br.unesp.rc.Restaurante.controller;

/*
@author Guilherme on 12/07/2022.
@project Restaurante
*/

import br.unesp.rc.Restaurante.model.Pedido;
import br.unesp.rc.Restaurante.service.PedidoService;
import br.unesp.rc.Restaurante.service.PedidoServiceImpl;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.net.URI;
import java.util.List;

@RestController
@CrossOrigin(origins="http://localhost:3000")
@RequestMapping("/pedido")
@RequiredArgsConstructor
@Slf4j
public class PedidoController {

    private final PedidoService pedidoService;

    @GetMapping("/")
    public ResponseEntity<List<Pedido>> getPedidos(){
        List<Pedido> pedidos = pedidoService.getAllPedidos();
        return ResponseEntity.ok().body(pedidos);
    }

    @PostMapping("/")
    public ResponseEntity<Pedido>savePedido(@RequestBody Pedido pedido){
        URI uri = URI.create(ServletUriComponentsBuilder.fromCurrentContextPath().path("/pedido/").toUriString()); // Uri Para retorno no HEADER
        return ResponseEntity.created(uri).body(pedidoService.savePedido(pedido));
    }


}