package academy.devdojo.maratonajava.javacore.Hherança.test;

import academy.devdojo.maratonajava.javacore.Hherança.dominio.Endereco;
import academy.devdojo.maratonajava.javacore.Hherança.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Hherança.dominio.Pessoa;

public class HerançaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua Milck Felix");
        endereco.setCep("07792430");
        endereco.setNumero(32);

        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Rodrigo");
        pessoa.setCpf("48021312594");
        pessoa.setEndereco(endereco);

        pessoa.imprime();

        System.out.println("---- FUNCIONARIO ----");
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("David");
        funcionario.setCpf("213125812951");
        funcionario.setEndereco(endereco);
        funcionario.setCargo("Dev Pleno");
        funcionario.setSalario(5000);
        funcionario.imprime();
    }

}
