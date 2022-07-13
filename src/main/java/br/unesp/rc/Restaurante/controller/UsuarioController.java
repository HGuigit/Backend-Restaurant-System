package br.unesp.rc.Restaurante.controller;

import br.unesp.rc.Restaurante.model.Usuario;
import br.unesp.rc.Restaurante.service.UsuarioService;
import br.unesp.rc.Restaurante.service.UsuarioServiceImpl;
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
@RequestMapping("/usuario")
@RequiredArgsConstructor
@Slf4j
public class UsuarioController {

    private final UsuarioService usuarioService;

    @GetMapping("/")
    public ResponseEntity<List<Usuario>> getUsuarios(){
        List<Usuario> usuarios = usuarioService.getAllUsuarios();
        return ResponseEntity.ok().body(usuarios);
    }

    @PostMapping("/")
    public ResponseEntity<Usuario>saveUsuario(@RequestBody Usuario usuario){
        URI uri = URI.create(ServletUriComponentsBuilder.fromCurrentContextPath().path("/usuario/").toUriString()); // Uri Para retorno no HEADER
        return ResponseEntity.created(uri).body(usuarioService.saveUsuario(usuario));
    }


}