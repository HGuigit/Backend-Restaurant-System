package br.unesp.rc.Restaurante.controller;

import br.unesp.rc.Restaurante.model.Funcionario;
import br.unesp.rc.Restaurante.service.FuncionarioService;
import br.unesp.rc.Restaurante.service.FuncionarioServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
@RequestMapping("/Funcionarios")
@RequiredArgsConstructor
public class FuncionarioController {

    private final FuncionarioService funcionarioService;

    @GetMapping("/")
    public List<Funcionario> getFuncionario(HttpServletRequest, HttpServletResponse){

    }


}