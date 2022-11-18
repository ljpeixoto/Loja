package com.ljpeixoto.loja.desconto;

import com.ljpeixoto.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoQuantidadeItens {
    public BigDecimal calcular(Orcamento orcamento) {
        if (orcamento.getQuantidadeItens() > 5) {
            return orcamento.getValor().multiply(new BigDecimal("0.1"));
        }
        return BigDecimal.ZERO;
    }
}