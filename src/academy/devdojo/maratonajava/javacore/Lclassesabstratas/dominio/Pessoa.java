package academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio;

public abstract class Pessoa {
    public abstract void imprime();
    //se tiver uma classe abstrata dentro de outra classe abstrata
    // a classe abstrata filho nao precisa implementar os metodos da classe pai
    // porem as classes netos se nao forem abstratas precisam

    // agora se eu usar o metodo abstrato da classe pai na classe abstrata filho as classes concretas netos nao tem mais 0obrigacao e passar tbm
}
