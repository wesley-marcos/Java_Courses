package br.com.alura;

import java.util.*;

public class LinkedHashSetEx {

    public static void main(String[] args) {

        Set<Aluno> alunoSet = new LinkedHashSet<>();

        Aluno a1 = new Aluno("Harry Potter", 1);
        Aluno a2 = new Aluno("Ron Weasley", 2);
        Aluno a3 = new Aluno("Hermione Granger", 3);
        Aluno a4 = new Aluno("Harry Potter", 4);

        alunoSet.add(a1);
        alunoSet.add(a2);
        alunoSet.add(a3);
        alunoSet.add(a4);

        alunoSet.forEach(System.out::println);
    }
}

