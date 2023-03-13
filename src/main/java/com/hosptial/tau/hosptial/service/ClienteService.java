package com.hosptial.tau.hosptial.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hosptial.tau.hosptial.model.*;
import com.hosptial.tau.hosptial.repository.*;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ClienteService {
    
    @Autowired
    private ClienteRepo repo;

    public Cliente cadastrarCliente(Cliente cliente) {
        return repo.save(cliente);
    }
    public List<Cliente> recuperarTodos() {
        return (List<Cliente>) repo.findAll();
    }

    public Cliente recuperarPeloID(Long id) {
        return repo.findById((long) id).orElse(null);}
   

}
