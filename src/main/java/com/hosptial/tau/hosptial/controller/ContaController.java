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

import com.hosptial.tau.hosptial.model.Cliente;
import com.hosptial.tau.hosptial.model.Conta;
import com.hosptial.tau.hosptial.service.ContaService;

@RestController
@RequestMapping("/contas")
public class ContaController {

    @Autowired
    private ContaService service;

    @GetMapping // 1
    public ResponseEntity<List<Conta>> getAll() {
            List<Conta> lista = (List<Conta>) service.getAll();
    if  (lista == null || lista.size() == 0) {
            return ResponseEntity.notFound().build();
    }
    return ResponseEntity.ok(lista);
  
    }



    

    /*@PostMapping
    public ResponseEntity<Conta> adicionarConta(@RequestBody Conta conta) {
        Conta contaInserido = service.adicionarConta(conta);
        if (contaInserido == null) {
            return ResponseEntity.badRequest().build();
        }
        return ResponseEntity.status(HttpStatus.CREATED).body(contaInserido);

    }

    @GetMapping("/{numero}")
    public ResponseEntity<Conta> recuperarPeloNumero(@PathVariable int numero) {
        Conta conta = service.recuperarPeloNumero(numero);
        return ResponseEntity.ok(conta);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Conta> alterarDados(@PathVariable long id, @RequestBody Conta conta) {
        Conta contaAtualizado = service.alterarDados(id, conta);
        if (contaAtualizado == null) {
            return ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok(contaAtualizado);

    }

    @GetMapping("/cliente/{}")
    public ResponseEntity<List<Conta>> recuperarContasPeloCliente(@PathVariable int id) {
        List<Conta> contas = service.recuperarContasPeloCliente(id);
        return ResponseEntity.ok(contas);
    }*/

}
