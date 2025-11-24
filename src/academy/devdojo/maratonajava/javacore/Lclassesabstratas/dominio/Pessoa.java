package academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio;

public abstract class Pessoa {
    public abstract void imprime();
    //se tiver uma classe abstrata dentro de outra classe abstrata
    // a classe abstrata pai nao precisa implementar os metodos da classe avo
    // porem as classes filho se nao forem abstratas precisam
    // agora se eu usar o metodo abstrato da classe avo na classe abstrata pai as classes concretas filhos nao tem mais 0obrigacao de passar tbm
//-----------------------------------------------------------------------
    //1 bisavo = object
    //2 avo = Pessoa
    //3 pai = Funcionario
    //4 filhos = Gerente / Desenvolvedor
}
