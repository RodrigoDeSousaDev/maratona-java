package academy.devdojo.maratonajava.javacore.bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.bintroducaometodos.dominio.Pessoa;

// ---------------- ACOPLAMENTO ---------------------

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
//        pessoa.nome = "Rodrogo";
//        pessoa.idade = -1;

        pessoa.setNome("Rodrigo");
        pessoa.setIdade(22);
        pessoa.imprime();

        System.out.println("Pegando o nome: "+pessoa.getNome());
        System.out.println("Pegando a idade: "+pessoa.getIdade());

    }
}
