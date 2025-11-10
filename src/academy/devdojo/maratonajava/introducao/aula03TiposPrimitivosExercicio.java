package academy.devdojo.maratonajava.introducao;
/*
Prática

crie variaveis para os camppos descritos abaixo entre <> e imprima a seguinte mensagem;

Eu <nome>, morando no endereço <endereço>,
confirmo que recebi o salário de <salário>, na data <data>
*/

public class aula03TiposPrimitivosExercicio {

    public static void main(String[] args) {
        String name = "Rodrigo";
        String endress = "rua milck felix, 32";
        int salario = 2500;
        String data = "01/05/2026";

        System.out.println("Eu " + name + ", morando no endereço: " + endress);
        System.out.print("confirmo que recebi o salário de R$"+salario+", na data "+ data);
    }


}
