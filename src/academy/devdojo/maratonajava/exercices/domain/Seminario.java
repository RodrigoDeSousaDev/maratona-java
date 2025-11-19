package academy.devdojo.maratonajava.exercices.domain;

public class Seminario {
    private String tema;
    private Estudante[] nomeEstudante;
    private Local endereco;


    public Seminario(String tema) {
        this.tema = tema;
    }

    public Seminario(String tema, Estudante[] nomeEstudante) {
        this.tema = tema;
        this.nomeEstudante = nomeEstudante;
    }

    public void imprime(){
        System.out.print("Tema do seminario: "+this.tema+ ", ");
        if (nomeEstudante != null){
            for (Estudante estudante : nomeEstudante) {
                System.out.print("Nome do aluno: " + estudante.getNomeEstudante() + ", ");
            }
        }else{
            System.out.println("nenhum estudante cadastrado");
        }
        if(endereco != null){
            System.out.println("Endereço: "+ this.endereco.getEndereco());;
        }
    }

    public String getTema() {
        return tema;
    }
    public void setTema(String tema) {
        this.tema = tema;
    }

    public Estudante[] getNomeEstudante() {
        return nomeEstudante;
    }

    public void setNomeEstudante(Estudante[] nomeEstudante) {
        this.nomeEstudante = nomeEstudante;
    }

    public Local getEndereco() {
        return endereco;
    }

    public void setEndereco(Local endereco) {
        this.endereco = endereco;
    }
}
