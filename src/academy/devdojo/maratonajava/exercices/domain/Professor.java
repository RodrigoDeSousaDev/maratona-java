package academy.devdojo.maratonajava.exercices.domain;

public class Professor {
    private String nomeProfessor;
    private String especialidade;
    private Seminario[] tema;


    public Professor(String nomeProfessor, String especialidade) {
        this.nomeProfessor = nomeProfessor;
        this.especialidade = especialidade;
    }

    public Professor(String nomeProfessor, String especialidade, Seminario[] tema) {
        this.nomeProfessor = nomeProfessor;
        this.especialidade = especialidade;
        this.tema = tema;
    }

    public void imprime(){
        System.out.print("Nome do professor: "+this.nomeProfessor+ ", ");
        System.out.print("especialização do professor: "+this.especialidade+ ", ");
        if(tema != null){
            for (Seminario seminario : tema) {
                System.out.println("seminarios aplicados: "+seminario.getTema()+ ", ");
            }
        }else{
            System.out.println("nenhum seminario cadastrado");
        }
    }

    public String getNomeProfessor() {
        return nomeProfessor;
    }
    public void setNomeProfessor(String nomeProfessor) {
        this.nomeProfessor = nomeProfessor;
    }
    public String getEspecialidade() {
        return especialidade;
    }
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Seminario[] getTema() {
        return tema;
    }

    public void setTema(Seminario[] tema) {
        this.tema = tema;
    }
}
