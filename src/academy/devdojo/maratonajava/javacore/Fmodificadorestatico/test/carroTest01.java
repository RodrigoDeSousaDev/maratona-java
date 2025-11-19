package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.test;

import academy.devdojo.maratonajava.javacore.Fmodificadorestatico.dominio.Carro;

public class carroTest01 {
    static String test;

    public static void main(String[] args) {

        test = "entendo";
        Carro.setVelocidadeLimite(150);
        Carro c1 = new Carro("BMW", 280);
        Carro c2 = new Carro("porche", 320);
        Carro c3 = new Carro("mercedez", 210);

        c1.imprime();
        c2.imprime();
        c3.imprime();
    }
}
