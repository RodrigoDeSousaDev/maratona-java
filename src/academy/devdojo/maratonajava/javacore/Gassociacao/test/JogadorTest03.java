package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Jogador;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("ronaldo");
        Jogador jogador2 = new Jogador("cassio");
        Jogador jogador3 = new Jogador("pelé");
        Time time = new Time("brasil");
        Jogador[] jogadores = {jogador1, jogador2, jogador3};

        for (Jogador jogador : jogadores) {
            jogador.setTime(time);
        }

        time.setJogadores(jogadores);

        System.out.println("--- jogador ---");
        for (Jogador jogador : jogadores) {
            jogador.imprime();

        }


        System.out.println("--- time ---");
        time.imprime();
    }
}
