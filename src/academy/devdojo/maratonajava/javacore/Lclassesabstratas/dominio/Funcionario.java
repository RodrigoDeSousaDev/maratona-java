package academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio;

//uma class abstract nao pode ser instanciada !new funcionario()
// nao pode misturar uma class abstract com um final
// abstract e uma class q deve ser extendida e final é uma class que nao pode ser extendida
public abstract class Funcionario extends Pessoa{
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        calcularBonus();
    }

    // nao posso ter metodos abstratos em classes concretas
    // porem posso ter metodos concretos em classes abstratas
    public abstract void calcularBonus();

    @Override
    public void imprime() {
        System.out.println("imprimindo");
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
