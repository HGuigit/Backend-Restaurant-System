package br.unesp.rc.Restaurante.controller;

import br.unesp.rc.Restaurante.model.Funcionario;
import br.unesp.rc.Restaurante.service.FuncionarioService;
import br.unesp.rc.Restaurante.service.FuncionarioServiceImpl;
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
@CrossOrigin(origins="http://localhost:3000")
@RequestMapping("/funcionario")
@RequiredArgsConstructor
@Slf4j
public class FuncionarioController {

    private final FuncionarioService funcionarioService;

    @GetMapping("/")
    public ResponseEntity<List<Funcionario>> getFuncionarios(){
        List<Funcionario> funcionarios = funcionarioService.getAllFuncionarios();
        return ResponseEntity.ok().body(funcionarios);
    }

    @PostMapping("/")
    public ResponseEntity<Funcionario>saveFuncionario(@RequestBody Funcionario funcionario){
        URI uri = URI.create(ServletUriComponentsBuilder.fromCurrentContextPath().path("/funcionario/").toUriString()); // Uri Para retorno no HEADER
        return ResponseEntity.created(uri).body(funcionarioService.saveFuncionario(funcionario));
    }


}