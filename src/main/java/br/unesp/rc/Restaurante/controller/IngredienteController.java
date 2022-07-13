package br.unesp.rc.Restaurante.controller;


import br.unesp.rc.Restaurante.model.Ingrediente;
import br.unesp.rc.Restaurante.service.IngredienteService;
import br.unesp.rc.Restaurante.service.IngredienteServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
@RequestMapping("/ingredientes")
@RequiredArgsConstructor
public class IngredienteController {

    private final IngredienteService ingredienteService;

    @GetMapping("/")
    public List<Ingrediente> getIngredientes(HttpServletRequest, HttpServletResponse){

    }


}