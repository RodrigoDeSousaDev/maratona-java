package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Jogador;

public class JogadorTest01 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("pelé");
        Jogador jogador2 = new Jogador("romario");
        Jogador jogador3 = new Jogador("messi");

        Jogador[] jogadores = {jogador1, jogador2, jogador3};

       for (Jogador jogador: jogadores){
           jogador.imprime();
       }
    }

}
