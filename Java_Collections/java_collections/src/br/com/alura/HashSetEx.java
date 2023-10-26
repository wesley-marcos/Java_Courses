package br.com.alura;
import java.util.*;
public class HashSetEx {

    public static void main(String[] args) {

        Set<Aluno> alunoSet = new HashSet<>();

        Aluno a1 = new Aluno("Harry Potter", 1);
        Aluno a2 = new Aluno("Ron Weasley", 2);
        Aluno a3 = new Aluno("Hermione Granger", 3);

        alunoSet.add(a1);
        alunoSet.add(a2);
        alunoSet.add(a3);

        alunoSet.forEach(System.out::println);
    }
}


