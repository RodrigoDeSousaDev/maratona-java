package academy.devdojo.maratonajava.javacore.bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.somaDoisMaisDois();
        calculadora.subtraiDoisNumeros();
        System.out.println("Finalizando a calculadora teste" );


        calculadora.multiplicaDoisNumeros(10,20);


    }
}
