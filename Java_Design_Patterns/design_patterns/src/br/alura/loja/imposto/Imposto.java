package br.alura.loja.imposto;

import br.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public interface Imposto {

    public BigDecimal calcular(Orcamento orcamento);
}
