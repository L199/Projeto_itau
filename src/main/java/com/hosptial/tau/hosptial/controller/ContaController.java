package com.hosptial.tau.hosptial.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.hosptial.tau.hosptial.model.Conta;
import com.hosptial.tau.hosptial.service.ContaService;

@RestController
@RequestMapping("/contas")
public class ContaController {

    @Autowired
    private ContaService service;

   
   
   
    @PostMapping
    public ResponseEntity<Conta> adicionarConta(@RequestBody Conta conta) {
        Conta contaCriada = service.adicionarConta(conta);
        return ResponseEntity.created(
                ServletUriComponentsBuilder.fromCurrentRequest()
                        .path("/{id}")
                        .buildAndExpand(contaCriada.getNumeroConta())
                        .toUri())
                .body(contaCriada);
    }

    @GetMapping("/{numero}")
    public ResponseEntity<Conta> recuperarPeloNumero(@PathVariable int numero) {
        Conta conta = service.recuperarPeloNumero(numero);
        return ResponseEntity.ok(conta);
    }

    @PutMapping("/{numero}")
    public ResponseEntity<Conta> alterarDados(@PathVariable int numero, @RequestBody Conta conta) {
        Conta contaAtualizada = service.alterarDados(numero, conta);
        return ResponseEntity.ok(contaAtualizada);
    }

    @GetMapping("/cliente/{id}")
    public ResponseEntity<List<Conta>> recuperarContasPeloCliente(@PathVariable int id) {
        List<Conta> contas = service.recuperarContasPeloCliente(id);
        return ResponseEntity.ok(contas);
    }
   

   
   
   
   
   

   
   
   
   
   
   

   
   
   
   
   

}
