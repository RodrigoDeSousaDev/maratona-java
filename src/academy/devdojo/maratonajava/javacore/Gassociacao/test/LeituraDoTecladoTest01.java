package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import java.util.Scanner;

public class LeituraDoTecladoTest01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite seu nome abaixo");
        String nome = input.nextLine();
        System.out.println("Digite sua idade");
        int idade = input.nextInt();
        System.out.println("digite F ou M para seu sexo");
        char sexo = input.next().charAt(0);
        System.out.println("------------------");
        System.out.println("Nome: "+ nome);
        System.out.println("Idade: "+ idade);
        if(sexo == 'M'){
            System.out.println("Sexo: Masculino");
        }else if(sexo == 'F'){
            System.out.println("Sexo: Feminino");
        }else {
            System.out.println("sexo inválido");
        }



    }
}
