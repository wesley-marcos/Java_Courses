package br.com.alura;

import java.util.Objects;

public class Aluno{

    private String nome;
    private int numeroMatricula;

    public Aluno(String nome, int numeroMatricula) {

        if(nome == null){
            throw new NullPointerException("'Nome' não pode ser do tipo null!");
        }
        this.nome = nome;
        this.numeroMatricula = numeroMatricula;
    }

    public String getNome() {
        return nome;
    }

    public int getNumeroMatricula() {
        return numeroMatricula;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return numeroMatricula == aluno.numeroMatricula && Objects.equals(nome, aluno.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, numeroMatricula);
    }

    @Override
    public String toString() {
        return "Aluno: " + this.nome + ", matrícula: " + this.numeroMatricula;
    }
}
