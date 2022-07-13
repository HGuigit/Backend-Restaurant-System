package br.unesp.rc.Restaurante.controller;

/*
@author Guilherme on 12/07/2022.
@project Restaurante
*/

import br.unesp.rc.Restaurante.model.Receita;
import br.unesp.rc.Restaurante.service.ReceitaService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@CrossOrigin(origins="http://localhost:3000")
@RequestMapping("/receita")
@RequiredArgsConstructor
@Slf4j
public class ReceitaController {

    private final ReceitaService receitaService;

    @GetMapping("/")
    public ResponseEntity<List<Receita>> getReceitas(){
        List<Receita> receitas = receitaService.getAllReceitas();
        return ResponseEntity.ok().body(receitas);
    }

    @PostMapping("/")
    public ResponseEntity<Receita>saveReceita(@RequestBody Receita receita){
        URI uri = URI.create(ServletUriComponentsBuilder.fromCurrentContextPath().path("/receita/").toUriString()); // Uri Para retorno no HEADER
        return ResponseEntity.created(uri).body(receitaService.saveReceita(receita));
    }


}
