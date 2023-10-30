package br.alura.loja.pedido.acao;

import br.alura.loja.pedido.Pedido;

public class SalvarPedidoNoBancoDeDados implements AcaoAposGerarPedido{

    public void executaAcao(Pedido pedido){
        System.out.println("Salvar pedido no banco de dados");
    }
}
