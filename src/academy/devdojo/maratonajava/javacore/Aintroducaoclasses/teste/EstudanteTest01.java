package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.teste;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        // e o objeto (Estudante)
        // variavel de referencia (estudante)

        Estudante estudante = new Estudante();
        estudante.nome = "Rodrigo";
        estudante.idade = 12;
        estudante.sexo = 'M';

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
        System.out.println(estudante);
        //se tentar imprimir so o estudante va retornar um enderecop de memoria pois estudante e uma variavel de referencia

    }
}
