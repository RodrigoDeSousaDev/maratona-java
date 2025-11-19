package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.dominio;

public class Anime {
    private String nome;
    private static int[] episodios;

    // 0 - Bloco de inicialização é executado apenas uma vez quando a jvm carregar a classe
    // 1 - alocado espaco em memoria pro objeto
    // Cada atributo de classe e criado e inicializado com valores defaut ou o que for passado
    // 3 - Bloco de inicializacao e executado
    // 4 - contrutor e executado

    static {
        System.out.println("dentro do bloco de inicializacao estático 1");
        episodios = new int[100];
        for(int i = 0; i < episodios.length; i++){
            episodios[i] = i+1;
        }
    }

    static {
        System.out.println("dentro do bloco de inicializacao estático 2");
    }

    static {
        System.out.println("dentro do bloco de inicializacao estático 3");
    }

    {
        System.out.println("dentro do bloco de inicializacao não estático 4");
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {
        for (int episodio: Anime.episodios){
            System.out.print(episodio+ " ");
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
