package br.com.alura;

import java.util.Set;
import java.util.TreeSet;

public class Recibo implements Comparable{

    private String nome;
    private double valor;
    private String razaoSocial;
    private String data;

    private Set<Aluno> alunos = new TreeSet<>();

    public Set<Aluno> getAlunos(Aluno a) {
        return alunos;
    }

    @Override
    public String toString() {
        return "Recibo{" +
                "nome='" + nome + '\'' +
                ", valor=" + valor +
                ", razaoSocial='" + razaoSocial + '\'' +
                ", data='" + data + '\'' +
                ", alunos=" + alunos +
                '}';
    }

    public Recibo(String nome, double valor, String razaoSocial, String data) {
        this.nome = nome;
        this.valor = valor;
        this.razaoSocial = razaoSocial;
        this.data = data;
    }

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public String getData() {
        return data;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
