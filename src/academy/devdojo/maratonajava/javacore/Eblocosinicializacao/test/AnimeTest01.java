package academy.devdojo.maratonajava.javacore.Eblocosinicializacao.test;

import academy.devdojo.maratonajava.javacore.Eblocosinicializacao.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();


        // alt + enter pra criar um foreach
        for (int episodio : anime.getEpisodios()) {
            System.out.println(episodio+ " ");
        }


    }
}
