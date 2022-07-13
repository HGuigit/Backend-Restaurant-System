package br.unesp.rc.Restaurante.controller;


import br.unesp.rc.Restaurante.model.Autorizacao;
import br.unesp.rc.Restaurante.service.AutorizacaoService;
import br.unesp.rc.Restaurante.service.AutorizacaoServiceImpl;
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
@RequestMapping("/autorizacao")
@RequiredArgsConstructor
@Slf4j
public class AutorizacaoController {

    private final AutorizacaoService autorizacaoService;

    @GetMapping("/")
    public ResponseEntity<List<Autorizacao>> getAutorizacoes(){
        List<Autorizacao> autorizacoes = autorizacaoService.getAllAutorizacoes();
        return ResponseEntity.ok().body(autorizacao);
    }

    @PostMapping("/")
    public ResponseEntity<Autorizacao>saveAutorizacao(@RequestBody Autorizacao autorizacao){
        URI uri = URI.create(ServletUriComponentsBuilder.fromCurrentContextPath().path("/autorizacao/").toUriString()); // Uri Para retorno no HEADER
        return ResponseEntity.created(uri).body(autorizacaoService.saveAutorizacao(autorizacao));
    }


}