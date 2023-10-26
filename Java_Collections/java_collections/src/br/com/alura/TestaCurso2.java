package br.com.alura;

import java.util.ArrayList;
import java.util.List;

public class TestaCurso2 {

    public static void main(String[] args) {

        Curso javaColecoes = new Curso("Dominando as coleções do Java",
                "Paulo Silveira");

        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
        javaColecoes.adiciona(new Aula("Modelando com coleções", 22));

        System.out.println(javaColecoes.getAulas());

        List<Aula> aulasImutaveis = javaColecoes.getAulas();

        List<Aula> aulas = new ArrayList<Aula>(aulasImutaveis);
        System.out.println(aulas);
    }
}
