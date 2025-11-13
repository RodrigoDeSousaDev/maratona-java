package academy.devdojo.maratonajava.javacore.Eblocosinicializacao.dominio;

public class Anime {
    private String nome;
    private int[] episodios;

    // 1 - alocado espaco em memoria pro objeto
    // Cada atributo de classe e criado e inicializado com valores defaut ou o que for passado
    // 3 - Bloco de inicializacao e executado
    // 4 - contrutor e executado

    {
        System.out.println("dentro do bloco de inicializacao");
        episodios = new int[100];
        for(int i = 0; i < episodios.length; i++){
            episodios[i] = i+1;
        }
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {
        for (int episodio: this.episodios){
            System.out.println(episodio+ " ");
        }
        System.out.println();
    }

    public int[] getEpisodios() {
        return episodios;
    }

    public String getNome() {
        return nome;
    }
}
