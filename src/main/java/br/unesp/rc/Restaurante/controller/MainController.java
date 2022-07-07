package br.unesp.rc.Restaurante.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
@author Guilherme on 07/07/2022.
@project Restaurante
*/
@RestController
@RequestMapping("/")
@RequiredArgsConstructor
public class MainController {


    @GetMapping("/")
    public String getHelloWorld(){
        return "<h1> Olá mundo </h1> <br/> <h3> Testando aplicação spring</h3>";
    }



}
