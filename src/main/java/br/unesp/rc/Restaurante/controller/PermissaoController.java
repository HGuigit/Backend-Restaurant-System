package br.unesp.rc.Restaurante.controller;

/*
@author Guilherme on 12/07/2022.
@project Restaurante
*/

import br.unesp.rc.Restaurante.model.Permissao;
import br.unesp.rc.Restaurante.service.PermissaoService;
import br.unesp.rc.Restaurante.service.PermissaoServiceImpl;
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
@RequestMapping("/permissao")
@RequiredArgsConstructor
@Slf4j
public class PermissaoController {

    private final PermissaoService permissaoService;

    @GetMapping("/")
    public ResponseEntity<List<Permissao>> getPermissoes(){
        List<Permissao> permissoes = permissaoService.getAllPermissoes();
        return ResponseEntity.ok().body(permissoes);
    }

    @PostMapping("/")
    public ResponseEntity<Permissao>savePermissao(@RequestBody Permissao permissao){
        URI uri = URI.create(ServletUriComponentsBuilder.fromCurrentContextPath().path("/permissao/").toUriString()); // Uri Para retorno no HEADER
        return ResponseEntity.created(uri).body(permissaoService.savePermissao(permissao));
    }


}