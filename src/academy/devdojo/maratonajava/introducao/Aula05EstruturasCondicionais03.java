package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        //  OPERADOR TERNARIO
        //doar se salario for maior quie 5000

        double salario = 2500;
        String mensagemdoar = "Eu vou doar 500 pra ninguem";
        String mensagemNaoDoar = "ainda nao tenho condiçoes mas vou ter";
        String resultado = salario >= 5000 ? mensagemdoar : salario >=2000 && salario <= 3000 ? "ainda nao" : mensagemNaoDoar;

        System.out.println(resultado);
    }
}
