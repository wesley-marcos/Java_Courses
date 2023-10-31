package br.alura.loja.orcamento;

import br.alura.loja.DomainException;
import br.alura.loja.http.HttpAdapter;

import java.util.Map;
import java.util.Objects;

public class RegistroDeOrcamento {

    private HttpAdapter http;

    public RegistroDeOrcamento(HttpAdapter http) {
        this.http = http;
    }

    public void registrar(Orcamento orcamento){

        if(!orcamento.isFinalizado()){
            throw new DomainException("Orçamento não finalizado!");
        }
        String url = "http://api.externa/orcamento";

        Map<String, Object> dados = Map.of(
                "valor", orcamento.getValor(),
                "quantidadeItens", orcamento.getQuantidadeItens()
        );

        http.post(url, dados);
    }
}
