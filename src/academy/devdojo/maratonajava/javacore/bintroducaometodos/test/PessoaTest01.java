package academy.devdojo.maratonajava.javacore.bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.bintroducaometodos.dominio.Pessoa;

// ---------------- ACOPLAMENTO ---------------------

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
//        pessoa.nome = "Rodrogo";
//        pessoa.idade = -1;

        pessoa.setNome("Rodrigo");
        pessoa.setIdade(-1);
        pessoa.imprime();
    }
}
