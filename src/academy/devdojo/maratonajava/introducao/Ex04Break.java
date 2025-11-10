package academy.devdojo.maratonajava.introducao;

public class Ex04Break {
    public static void main(String[] args) {
        //Dado o valor de um carro descubra quantas vezes quantas vezes ele pode ser parcelado
        // condicao valoParcela >= 1000
        double valorDoCarro = 50000;
        for(int parcela = 1; parcela <= valorDoCarro; parcela++){
            double valorParcela = valorDoCarro / parcela;
            if(valorParcela >= 1000){
                System.out.println("parcela"+ parcela+ " valor da parcela "+valorParcela);
            }else{
                break;
            }
            System.out.println("fora"+parcela);
        }


    }
}
