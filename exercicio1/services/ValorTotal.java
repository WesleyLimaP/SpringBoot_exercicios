package com.devSuperior.aula.exercicio1.services;

import com.devSuperior.aula.exercicio1.entities.Pedido;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ValorTotal {
    @Autowired
    private ServicoDeEntrega servicoDeEntrega;

    public Double valorTotoal(Pedido pedido){
        double porcentagem =  100 / pedido.getValorBase();
        double desconto =  (pedido.getValorBase() +servicoDeEntrega.frete(pedido)) *porcentagem;
        return pedido.getValorBase() - desconto;
    }
}
