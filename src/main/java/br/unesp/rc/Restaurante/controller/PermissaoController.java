package br.unesp.rc.Restaurante.controller;

import br.unesp.rc.Restaurante.model.Permissoes;
import br.unesp.rc.Restaurante.service.PermissoesService;
import br.unesp.rc.Restaurante.service.PermissoesServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
@RequestMapping("/Permissoes")
@RequiredArgsConstructor
public class PermissoesController {

    private final PermissoesService permissoesService;

    @GetMapping("/")
    public List<Permissoes> getPermissoes(HttpServletRequest, HttpServletResponse){

    }


}