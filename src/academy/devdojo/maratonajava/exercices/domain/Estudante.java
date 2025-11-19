package academy.devdojo.maratonajava.exercices.domain;

public class Estudante {
    private String nomeEstudante;
    private int idade;
    private Seminario tema;


    public Estudante(String nomeEstudante, int idade) {
        this.nomeEstudante = nomeEstudante;
        this.idade = idade;
    }

    public void imprime(){
        System.out.print("Nome do aluno: "+this.nomeEstudante+ ", ");
        System.out.print("Idade do aluno: "+this.idade+ ", ");
        if(tema != null){
            System.out.println("seminario do aluno: "+ tema.getTema());
        }else{
            System.out.println("nenhum seminario cadastrado");
        }
    }

    public String getNomeEstudante() {
        return nomeEstudante;
    }
    public void setNomeEstudante(String nomeEstudante) {
        this.nomeEstudante = nomeEstudante;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Seminario getTema() {
        return tema;
    }
    public void setTema(Seminario tema) {
        this.tema = tema;
    }
}
