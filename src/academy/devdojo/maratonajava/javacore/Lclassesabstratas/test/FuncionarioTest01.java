package academy.devdojo.maratonajava.javacore.Lclassesabstratas.test;

import academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio.Desenvolvedor;
import academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        //Funcionario funcionario = new Funcionario("Rodrigo", 2159); vai dar erro

        Gerente gerente = new Gerente("carlos", 5000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Rodrigo", 2105, "Back-End");

        System.out.println(gerente);
        System.out.println(desenvolvedor);


    }
}
