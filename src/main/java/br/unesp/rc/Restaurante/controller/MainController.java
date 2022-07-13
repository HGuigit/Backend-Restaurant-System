package br.unesp.rc.Restaurante.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
@author Guilherme on 07/07/2022.
@project Restaurante
*/
@RestController
@CrossOrigin(origins="http://localhost:3000")
@RequestMapping("/")
@RequiredArgsConstructor
public class MainController {


    @GetMapping("/")
    public String getHelloWorld(){
        return "<h1> Olá mundo </h1> <br/> <h3> Testando aplicação spring</h3>";
    }



}
