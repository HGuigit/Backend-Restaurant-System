package br.unesp.rc.Restaurante.controller;

import br.unesp.rc.Restaurante.model.Comanda;
import br.unesp.rc.Restaurante.service.ComandaService;
import br.unesp.rc.Restaurante.service.ComandaServiceImpl;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/comanda")
@RequiredArgsConstructor
@Slf4j
public class ComandaController {

    private final ComandaService comandaService;

    @GetMapping("/")
    public ResponseEntity<List<Comanda>> getComandas(){
        List<Comanda> comandas = comandaService.getAllComandas();
        return ResponseEntity.ok().body(comandas);
    }

    @PostMapping("/")
    public ResponseEntity<Comanda>saveComanda(@RequestBody Comanda comanda){
        URI uri = URI.create(ServletUriComponentsBuilder.fromCurrentContextPath().path("/comanda/").toUriString()); // Uri Para retorno no HEADER
        return ResponseEntity.created(uri).body(comandaService.saveComanda(comanda));
    }


}