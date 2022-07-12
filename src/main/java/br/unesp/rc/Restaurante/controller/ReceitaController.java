package br.unesp.rc.Restaurante.controller;

/*
@author Guilherme on 12/07/2022.
@project Restaurante
*/

import br.unesp.rc.Restaurante.model.Receita;
import br.unesp.rc.Restaurante.service.ReceitaService;
import br.unesp.rc.Restaurante.service.ReceitaServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
@RequestMapping("/receitas")
@RequiredArgsConstructor
public class ReceitaController {

    private final ReceitaService receitaService;

    @GetMapping("/")
    public List<Receita> getReceitas(HttpServletRequest, HttpServletResponse){

    }


}
