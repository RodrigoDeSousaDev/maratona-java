package academy.devdojo.maratonajava.javacore.bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.bintroducaometodos.dominio.Estudante;
import academy.devdojo.maratonajava.javacore.bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        estudante01.nome = "rodrigo";
        estudante01.idade = 22;
        estudante01.sexo = 'M';

        estudante02.nome = "gaby";
        estudante02.idade = 20;
        estudante02.sexo = 'F';

        estudante01.imprime();
        estudante02.imprime();
    }
}
