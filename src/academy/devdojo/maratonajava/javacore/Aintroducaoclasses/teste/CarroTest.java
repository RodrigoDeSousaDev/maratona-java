package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.teste;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1 = carro2;

        carro1.nome = "opala";
        carro1.modelo = "6 cilindros";
        carro1.ano = 97;

        carro2.nome = "omega";
        carro2.modelo = "cd";
        carro2.ano = 98;

        System.out.println("Nome do carro: "+ carro1.nome + ", Modelo: "+carro1.modelo+ ", Ano: "+ carro1.ano);
        System.out.println("=========================================================================================");
        System.out.print("Nome do carro: "+ carro2.nome + ", Modelo: "+carro2.modelo+ ", Ano: "+ carro2.ano);

    }
}
