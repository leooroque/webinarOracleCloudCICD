package br.com.webinar.cicd.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.webinar.cicd.model.CalculadoraSimples;
import br.com.webinar.cicd.model.CalculoSimples;

@RestController

public class CalculadoraController {

    @PostMapping
    @RequestMapping("/calcular")
    public double calcular(@RequestBody CalculoSimples detalhes){
     CalculadoraSimples cal = new CalculadoraSimples();
        return cal.calcular(detalhes);
    }

    @GetMapping
    @RequestMapping("/webinar")
    public String calcular(){
        if(1==1){

        }
        return "Webinar Oracle, seja bem vindo!! #CR";
    }
}