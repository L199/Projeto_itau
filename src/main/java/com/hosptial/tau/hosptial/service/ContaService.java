package com.hosptial.tau.hosptial.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hosptial.tau.hosptial.model.Conta;
import com.hosptial.tau.hosptial.model.Movimentacao;
import com.hosptial.tau.hosptial.repository.ContaRepo;

@Service
public class ContaService {

    @Autowired
    private ContaRepo repo;

    public Conta adicionarConta(Conta conta) {
        return repo.save(conta);
    }

    public Conta recuperarPeloNumero(int numero) {
        return repo.findById((long) numero).orElse(null);
    }

    public Conta alterarDados(int numero, Conta conta) {
        return repo.save(conta);
    }

    public List<Conta> recuperarContasPeloCliente(int id) {
        return repo.findByClienteIdCliente(id);
    }

}
