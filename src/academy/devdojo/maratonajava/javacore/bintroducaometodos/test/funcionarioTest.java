package academy.devdojo.maratonajava.javacore.bintroducaometodos.test;


import academy.devdojo.maratonajava.javacore.bintroducaometodos.dominio.Funcionario;

public class funcionarioTest {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.name = "Rodrigo";
        funcionario.age = 22;
        funcionario.salarios = new int[]{2041,1123,1668};


        funcionario.imprimeOsDados();
        System.out.println("\nA medis de pagamento é de: " + funcionario.mediaDosSalarios(funcionario.salarios));
    }
}
