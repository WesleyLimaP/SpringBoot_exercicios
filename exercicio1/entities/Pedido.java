package com.devSuperior.aula.exercicio1.entities;

import org.springframework.stereotype.Component;

@Component
public class Pedido {
    private Double valorBase;
    private Double desconto;
    private int codigo;

    public Pedido() {
    }

    public Pedido(Double valorBase, Double desconto, int codigo) {
        this.valorBase = valorBase;
        this.desconto = desconto;
        this.codigo = codigo;
    }

    public Double getValorBase() {
        return valorBase;
    }

    public void setValorBase(Double valorBase) {
        this.valorBase = valorBase;
    }

    public Double getDesconto() {
        return desconto;
    }

    public void setDesconto(Double desconto) {
        this.desconto = desconto;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

}
