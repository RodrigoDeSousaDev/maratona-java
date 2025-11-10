package academy.devdojo.maratonajava.javacore.bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.bintroducaometodos.dominio.Estudante;
import academy.devdojo.maratonajava.javacore.bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();


        estudante01.nome = "rodrigo";
        estudante01.idade = 22;
        estudante01.sexo = 'M';

        estudante02.nome = "gaby";
        estudante02.idade = 20;
        estudante02.sexo = 'F';

        impressora.imprimi(estudante01);
        impressora.imprimi(estudante02);
    }
}
