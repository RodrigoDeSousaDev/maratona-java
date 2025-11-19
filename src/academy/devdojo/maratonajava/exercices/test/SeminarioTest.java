package academy.devdojo.maratonajava.exercices.test;

import academy.devdojo.maratonajava.exercices.domain.Estudante;
import academy.devdojo.maratonajava.exercices.domain.Local;
import academy.devdojo.maratonajava.exercices.domain.Professor;
import academy.devdojo.maratonajava.exercices.domain.Seminario;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class SeminarioTest {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante("Rodrigo", 22);
        Estudante estudante2 = new Estudante("Regis", 20);
        Estudante estudante3 = new Estudante("biel", 19);
        Estudante estudantes1[] = {estudante2, estudante3};
        Estudante estudantes2[] = {estudante1};

        Seminario seminario1 = new Seminario("Java avançado");
        Seminario seminario2 = new Seminario("Lógica de pragramacao");
        Seminario temas1[] = {seminario2};
        Seminario temas2[] = {seminario1, seminario2};

        Professor professor1 = new Professor("Guanabara", "Logica de progamaçao");
        Professor professor2 = new Professor("jiraya", "Java");

        Local local1 = new Local("Rua milck felix");
        Local local2 = new Local("av. das palmeiras");

        estudante1.setTema(seminario1);
        estudante2.setTema(seminario2);
        estudante3.setTema(seminario2);

        seminario1.setNomeEstudante(estudantes2);
        seminario2.setNomeEstudante(estudantes1);

        professor1.setTema(temas1);
        professor2.setTema(temas2);

        seminario1.setEndereco(local1);
        seminario2.setEndereco(local2);

        System.out.println("------- alunos -------");
        estudante1.imprime();
        estudante2.imprime();
        estudante3.imprime();



        System.out.println("------- SEMINARIOS -------");
        seminario1.imprime();
        seminario2.imprime();

        System.out.println("------- PROFESSORES -------");
        professor1.imprime();
        professor2.imprime();
    }

}
