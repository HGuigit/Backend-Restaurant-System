package br.unesp.rc.Restaurante.controller;

import br.unesp.rc.Restaurante.model.Usuario;
import br.unesp.rc.Restaurante.service.UsuarioService;
import br.unesp.rc.Restaurante.service.UsuarioServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
@RequestMapping("/Usuarios")
@RequiredArgsConstructor
public class UsuarioController {

    private final UsuarioService usuarioService;

    @GetMapping("/")
    public List<Usuario> getUsuario(HttpServletRequest, HttpServletResponse){

    }


}