package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.test;

import academy.devdojo.maratonajava.javacore.Fmodificadorestatico.dominio.Carro;

public class carroTest01 {
    public static void main(String[] args) {
        Carro c1 = new Carro("BMW", 280);
        Carro c2 = new Carro("porche", 520);
        Carro c3 = new Carro("mercedez", 2010);

        Carro.velocidadeLimite = 210;

        c1.imprime();
        c2.imprime();
        c3.imprime();
    }
}
