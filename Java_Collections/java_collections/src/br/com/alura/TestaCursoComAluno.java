package br.com.alura;
import java.util.*;

public class TestaCursoComAluno {

    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Dominando as coleções do Java",
                "Paulo Silveira");

        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
        javaColecoes.adiciona(new Aula("Modelando com coleções", 22));

        Aluno a1 = new Aluno("Rodrigo Turini", 34672);
        Aluno a2 = new Aluno("Guilherme Silveira", 5617);
        Aluno a3 = new Aluno("Mauricio Aniche", 17645);

        javaColecoes.matricula(a1);
        javaColecoes.matricula(a2);
        javaColecoes.matricula(a3);

        System.out.println("Todos os alunos matriculados:");
        //javaColecoes.getAlunos().forEach(System.out::println);

        Set<Aluno> alunos = javaColecoes.getAlunos();
        Iterator<Aluno> iterador = alunos.iterator();

        //Iteração antes do Java 5
        while(iterador.hasNext()){
            Aluno aluno = iterador.next();
            System.out.println(aluno);
        }

        //Iteração à partir do Java 8
        for(Aluno a : javaColecoes.getAlunos()){
            System.out.println(a);
        }


//        System.out.println("O aluno " + a1.getNome() + " está matriculado?");
//        System.out.println("Resposta: " + javaColecoes.estaMatriculado(a1));
//
//        Aluno turiri = new Aluno("Rodrigo Turini", 34672);
//        System.out.println("O aluno a1 é igual (equals) ao Turirni?");
//        System.out.println("Resposta: " + a1.equals(turiri));
    }
}
