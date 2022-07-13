package br.unesp.rc.Restaurante.controller;

import br.unesp.rc.Restaurante.model.Ingrediente;
import br.unesp.rc.Restaurante.service.IngredienteService;
import br.unesp.rc.Restaurante.service.IngredienteServiceImpl;
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
@RequestMapping("/ingrediente")
@RequiredArgsConstructor
@Slf4j
public class IngredienteController {

    private final IngredienteService ingredienteService;

    @GetMapping("/")
    public ResponseEntity<List<Ingrediente>> getIngredientes(){
        List<Ingrediente> ingredientes = ingredienteService.getAllIngredientes();
        return ResponseEntity.ok().body(ingredientes);
    }

    @PostMapping("/")
    public ResponseEntity<Ingrediente>saveIngrediente(@RequestBody Ingrediente ingrediente){
        URI uri = URI.create(ServletUriComponentsBuilder.fromCurrentContextPath().path("/ingrediente/").toUriString()); // Uri Para retorno no HEADER
        return ResponseEntity.created(uri).body(ingredienteService.saveIngrediente(ingrediente));
    }


}
