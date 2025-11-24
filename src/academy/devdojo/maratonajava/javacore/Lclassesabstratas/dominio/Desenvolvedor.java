package academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio;

public class Desenvolvedor extends Funcionario{
    protected String funcao;

    public Desenvolvedor(String nome, double salario, String funcao) {
        super(nome, salario);
        this.funcao = funcao;
    }

    @Override
    public void calcularBonus() {
        this.salario = salario + salario * 0.05;
    }

    @Override
    public String toString() {
        return "Desenvolvedor{" +
                "nome='" + nome + '\'' +
                ", salario='" + salario + '\'' +
                ", funcao=" + funcao +
                '}';
    }
}
