package academy.devdojo.maratonajava.javacore.Kenum.dominio;

public enum TipoCliente {
    PESSOA_FISICA(1, "Pessoa física"),
    PESSOA_JURIDICA(2, "Pessoa juridica");

    public final int VALOR;
    public final String NOME_RELATORIO;

    TipoCliente(int valor, String nomeRelatorio) {
        this.VALOR = valor;
        this.NOME_RELATORIO = nomeRelatorio;
    }

}
