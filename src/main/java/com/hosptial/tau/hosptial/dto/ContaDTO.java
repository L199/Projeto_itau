package com.hosptial.tau.hosptial.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
public class ContaDTO {
    private Long numeroConta;
    private Integer agencia;
    private Integer tipoConta;
    private  Double saldo;
    
    public ContaDTO(Long numeroConta, Integer agencia, Integer tipoConta, Double saldo) {
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.tipoConta = tipoConta;
        this.saldo = saldo;
    }

    
    

    
    
    
    

    
}
