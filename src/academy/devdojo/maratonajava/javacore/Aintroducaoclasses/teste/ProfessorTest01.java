package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.teste;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "margarida";
        professor.idade = 42;
        professor.sexo = 'F';

        System.out.print(professor.nome+ " ");
        System.out.print(professor.idade+ " ");
        System.out.print(professor.sexo);
    }
}
