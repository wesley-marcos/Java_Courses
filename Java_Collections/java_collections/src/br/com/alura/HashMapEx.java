package br.com.alura;
import java.util.*;

public class HashMapEx {

    public static void main(String[] args) {

        Map<Integer, Aluno> dados = new HashMap<>();

        Aluno a1 = new Aluno("Harry Potter", 1);
        Aluno a2 = new Aluno("Ron Weasley", 2);
        Aluno a3 = new Aluno("Hermione Granger", 3);
        Aluno a4 = new Aluno("Harry Potter", 4);

        dados.put(1, a1);
        dados.put(2, a2);
        dados.put(3, a3);
        dados.put(4, a4);

        for (Map.Entry<Integer, Aluno> entry : dados.entrySet()) {
            Integer key = entry.getKey();
            Aluno value = entry.getValue();
            System.out.println("Chave: " + key + ", \nValor -> " + "Nome: "
                    + value.getNome() + ", Matrícula: " + value.getNumeroMatricula());
        }

    }
}

