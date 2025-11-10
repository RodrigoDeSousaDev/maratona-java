package academy.devdojo.maratonajava.javacore.bintroducaometodos.dominio;


//Crie uma classe Funcionario com os seguintes atributos
//nome
//idade
//salario //tres salarios devem ser guardado
//-------xxx--------

//crie dois metodos

// 1 - para imprimir os dados
// 2 - para tirar a média dos salarios imprimir o resultado

public class Funcionario {
    public String name;
    public int age;
    public int[] salarios = new int[3];

    public void imprimeOsDados(){
        System.out.println(this.name);
        System.out.println(this.age);
        for(int salario: salarios){
            System.out.print(salario +" ");
        }
    }

    public double mediaDosSalarios(int[] num){
        double somaDoSalario = 0;
        double mediaDoSalario;

        for(int numero: num){
            somaDoSalario += numero;
        }

        mediaDoSalario = somaDoSalario / salarios.length;
        return mediaDoSalario;
    }
}

