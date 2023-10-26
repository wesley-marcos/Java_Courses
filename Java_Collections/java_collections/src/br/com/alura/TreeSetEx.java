package br.com.alura;

import java.util.*;

public class TreeSetEx {

    public static void main(String[] args) {

        Set<String> alunoSet = new TreeSet<>();

        String a1 = "Harry Potter";
        String a2 = "Ron Weasley";
        String a3 = "Hermione Granger";
        String a4 = "Harry Potter";

        alunoSet.add(a1);
        alunoSet.add(a2);
        alunoSet.add(a3);
        alunoSet.add(a4);

        alunoSet.forEach(System.out::println);
    }
}

