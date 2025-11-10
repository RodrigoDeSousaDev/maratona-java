package academy.devdojo.maratonajava.javacore.bintroducaometodos.dominio;

// acoplamento

public class Pessoa {
    private String nome;
    private int idade;


    //convençoens de java,
    // sempre que criar um metodo para colocar um valor dentro de um atributo de memoria.
    // comeca colocando set

    public void setNome(String nome){
        this.nome = nome;
    }

    //CONTRATO
    public void setIdade(int idade){
        if(idade <0){
            System.out.println("idade invalida");
            return;
        }
        this.idade = idade;

    }

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.idade);
    }
}

