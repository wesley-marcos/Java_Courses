package br.alura.loja;

import br.alura.loja.pedido.GeraPedido;
import br.alura.loja.pedido.GeraPedidoHandler;
import br.alura.loja.pedido.acao.EnviarEmailPedido;
import br.alura.loja.pedido.acao.SalvarPedidoNoBancoDeDados;

import java.math.BigDecimal;
import java.util.Arrays;

public class TestesPedidos {

    public static void main(String[] args) {
        String cliente = "Rodrigo";
        BigDecimal valorOrcamento = new BigDecimal("300");
        int quantidadeItens = Integer.parseInt("2");

        GeraPedido gerador = new GeraPedido(cliente, valorOrcamento, quantidadeItens);
        GeraPedidoHandler handler = new GeraPedidoHandler(
                Arrays.asList(
                        new SalvarPedidoNoBancoDeDados(),
                        new EnviarEmailPedido()
                )
        );
        handler.execute(gerador);
    }
}
