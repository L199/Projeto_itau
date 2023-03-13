package com.hosptial.tau.hosptial.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hosptial.tau.hosptial.model.Conta;

import com.hosptial.tau.hosptial.repository.ContaRepo;

@Service
public class ContaService {

    @Autowired
    private ContaRepo repo;

    
    public Conta getById(long id) {
        Optional<Conta> contaOptional = repo.findById(id);
        if (contaOptional.isEmpty()) {
            throw new NotFoundException("Veiculo não encontrado");
        }
        Conta contaEncontrado = contaOptional.get();
        return contaEncontrado;
    }
    
    
    
    
    

    
    

    
    
    

    
    
    

    
    

    
    
    
    
    
    
    
   
   
   







    /*public Conta adicionarConta(Conta conta) {
        if(conta.getNumeroConta() > 0) {
            return null;
        }
        Conta contaInserido = repo.save(conta);
        return contaInserido;
    }*/

   /* public Conta recuperarPeloNumero(int numero) {
        return repo.findById((long) numero).orElse(null);
    }

    public Conta alterarDados(Long numeroConta, Conta conta) {
        Optional<Conta> contaOptional = repo.findById(numeroConta);
        if(contaOptional.isEmpty()) {
            return null;
        }
        conta.setNumeroConta(numeroConta);
        Conta contaAtualizado = repo.save(conta);
        return contaAtualizado;
    }

    public List<Conta> recuperarContasPeloCliente(int id) {
        return repo.findByClienteIdCliente(id);
    }*/

}
