package br.alura.loja.orcamento.situacao;

import br.alura.loja.DomainException;
import br.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class Aprovado extends SituacaoOrcamento{

    public BigDecimal calcularValorDescontoExtra(Orcamento orcamento){
        return orcamento.getValor().multiply(new BigDecimal("0.02"));
    }

    public void finalizar(Orcamento orcamento){
        orcamento.setSituacao(new Finalizado());
    }
}
