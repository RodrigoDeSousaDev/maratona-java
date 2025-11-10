package academy.devdojo.maratonajava.javacore.bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();
        double res = calculadora.divideDoisNumeros(10,0);
        System.out.println(res);

        calculadora.impreimeDivisaoDeDoisNumeros(87, 0);

    }
}
