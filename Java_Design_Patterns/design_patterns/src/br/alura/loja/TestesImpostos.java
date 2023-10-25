package br.alura.loja;

import br.alura.loja.imposto.CalculadoraDeImpostos;
import br.alura.loja.imposto.ICMS;
import br.alura.loja.imposto.ISS;
import br.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class TestesImpostos {

    public static void main(String[] args) {

        Orcamento orcamento = new Orcamento(new BigDecimal("100"));
        CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();
        System.out.println("Imposto ISS: R$" + calculadora.calcular(orcamento, new ISS()));
        System.out.println("Imposto ICMS: R$" + calculadora.calcular(orcamento, new ICMS()));
    }
}
