package academy.devdojo.maratonajava.javacore.Hherança.dominio;

public class Funcionario extends Pessoa{
    private String cargo;
    private double salario;

    static {
        System.out.println("Dentro do bloco static de Funcionario");
    }

    {
        System.out.println("dentro do bloco de inicializacao de Funcionario 1");
    }
    {
        System.out.println("dentro do bloco de inicializacao de Funcionario 2");
    }

    public Funcionario(String nome) {
        super(nome);
        System.out.println("dentro do construtor de funcionario");
    }

    public void imprime(){
        super.imprime();
        System.out.println(this.cargo);
        System.out.println(this.salario);
    }

    public void relatorioPagamento(){
        System.out.println(this.nome+" recebeu o salario de "+ this.salario);
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
