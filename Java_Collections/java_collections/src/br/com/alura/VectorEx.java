package br.com.alura;
import java.util.*;
public class VectorEx {

    public static void main(String args[]) {

        List<Aluno> vector = new Vector<>();

        Aluno a1 = new Aluno("Harry Potter", 1);
        Aluno a2 = new Aluno("Ron Weasley", 2);
        Aluno a3 = new Aluno("Hermione Granger", 3);

        vector.add(a1);
        vector.add(a2);
        vector.add(a3);

        Iterator<Aluno> iter1 = vector.iterator();

        System.out.println("Os alunos matriculados são:");
        while(iter1.hasNext()){
            System.out.println(iter1.next());
        }

        System.out.println("\nAchando aluno com o get():");
        System.out.println(vector.get(2));
    }
}


