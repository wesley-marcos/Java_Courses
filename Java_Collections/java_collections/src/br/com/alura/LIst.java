package br.com.alura;
import java.util.*;
public class LIst {
    public static void main(String[] args) {

        List<Aluno> alunosLink = new LinkedList<>();

        Aluno a1 = new Aluno("Wesley Marcos", 2);
        Aluno a2 = new Aluno("João Silva", 1);

        alunosLink.add(a1);
        alunosLink.add(a2);

        System.out.println("Primeiro aluno matriculado");
        System.out.println(alunosLink.get(0));
    }
}
//alunos.add(a1);
//        alunos.add(a2);
//List<Aluno> alunos = new ArrayList<>();
//alunos.forEach(System.out::println);