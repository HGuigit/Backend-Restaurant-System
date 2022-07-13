package br.unesp.rc.Restaurante.controller;

import br.unesp.rc.Restaurante.model.Autorizacao;
import br.unesp.rc.Restaurante.service.AutorizacaoService;
import br.unesp.rc.Restaurante.service.AutorizacaoServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
@RequestMapping("/Autorizacaos")
@RequiredArgsConstructor
public class AutorizacaoController {

    private final AutorizacaoService autorizacaoService;

    @GetMapping("/")
    public List<Autorizacao> getAutorizacao(HttpServletRequest, HttpServletResponse){

    }


}