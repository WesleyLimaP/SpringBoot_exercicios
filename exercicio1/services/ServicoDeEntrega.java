package com.devSuperior.aula.exercicio1.services;

import com.devSuperior.aula.exercicio1.entities.Pedido;
import org.springframework.stereotype.Service;

@Service
public class ServicoDeEntrega {
    public Double frete (Pedido pedido){
        if(pedido.getValorBase() <= 200){
            return 12.0;
        }
        else if (pedido.getValorBase() < 100) {
            return 20.0;
        }
        return 0.0;
    }
}
