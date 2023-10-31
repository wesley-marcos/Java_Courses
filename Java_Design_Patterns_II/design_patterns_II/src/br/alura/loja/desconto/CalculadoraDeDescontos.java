package br.alura.loja.desconto;

import br.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeDescontos {

    public BigDecimal calcular(Orcamento orcamento){

        Desconto cadeiaDeDescontos = new DescontoParaOrcamentoComMaisDeCincoItens(
                new DescontoParaOrcamentoComValorMaiorDeQuinhentos(
                        new SemDesconto()));

        return cadeiaDeDescontos.calcular(orcamento);
    }
}
