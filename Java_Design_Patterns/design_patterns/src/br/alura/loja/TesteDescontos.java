package br.alura.loja;

import br.alura.loja.desconto.CalculadoraDeDescontos;
import br.alura.loja.imposto.CalculadoraDeImpostos;
import br.alura.loja.orcamento.Orcamento;
import org.w3c.dom.ls.LSOutput;

import java.math.BigDecimal;

public class TesteDescontos {

    public static void main(String[] args) {
        Orcamento primeiroOrcamento = new Orcamento(new BigDecimal("200"), 6);
        Orcamento segundoOrcamento = new Orcamento(new BigDecimal("1000"), 1);

        CalculadoraDeDescontos calculadora = new CalculadoraDeDescontos();

        System.out.println("Desconto: R$" + calculadora.calcular(primeiroOrcamento));
        System.out.println("Desconto: R$" + calculadora.calcular(segundoOrcamento));
    }
}
