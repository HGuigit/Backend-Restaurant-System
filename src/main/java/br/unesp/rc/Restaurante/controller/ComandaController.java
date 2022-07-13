package br.unesp.rc.Restaurante.controller;

import br.unesp.rc.Restaurante.model.Comanda;
import br.unesp.rc.Restaurante.service.ComandaService;
import br.unesp.rc.Restaurante.service.ComandaServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
@RequestMapping("/Comandas")
@RequiredArgsConstructor
public class ComandaController {

    private final ComandaService comandaService;

    @GetMapping("/")
    public List<Comanda> getComanda(HttpServletRequest, HttpServletResponse){

    }


}