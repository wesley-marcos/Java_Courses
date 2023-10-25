package br.alura.loja.desconto;

import br.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeDescontos {

    public BigDecimal calcular(Orcamento orcamento){

        Desconto desconto = new DescontoParaOrcamentoComMaisDeCincoItens(
                new DescontoParaOrcamentoComValorMaiorDeQuinhentos(
                        new SemDesconto()));

        return desconto.calcular(orcamento);
    }
}
