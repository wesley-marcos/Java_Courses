package br.com.alura;

public class TestaRecibo {


    public static void main(String[] args) {
        Recibo rec1 = new Recibo("Compra", 50, "Mercado", "15/10");
        // atribui valores
        Recibo rec2 = new Recibo("Compra 2", 70, "Mercado", "16/10");
        // atribui valores
        Recibo rec3 = new Recibo("Compra 3", 20, "Mercado", "19/10");
        Aluno a1 = new Aluno("Eu", 45);
        Aluno a2 = new Aluno("Ele", 46);
        Aluno a3 = new Aluno("Ela", 47);
        rec1.getAlunos(a1);
        rec1.getAlunos(a2);
        rec1.getAlunos(a3);

        System.out.println("Recibos:\n" + rec1);
    }
}
