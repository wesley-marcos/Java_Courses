package br.alura.loja.pedido.acao;

import br.alura.loja.pedido.Pedido;

public class EnviarEmailPedido implements AcaoAposGerarPedido{

    public void executaAcao(Pedido pedido){
        System.out.println("Enviar email com dados do novo pedido");
    }
}
