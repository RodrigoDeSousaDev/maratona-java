package academy.devdojo.maratonajava.introducao;

// dado um determinado salrio eu quero saber qual o valor que eu tenho q pagar de imposto
// ate 34712 = 9.7%
// entre 34.712 e 68.507 =  37.35%
// acima 49.50%

public class Ex01Salario {
    public static void main(String[] args) {
       int salario = 50000;
       double desconto;
       double posImposto;

       if(salario <= 34712){
           desconto = salario * 0.097;
           posImposto = salario - desconto;
           System.out.println("salario anual R$" +salario+" imposto pago R$" +desconto+ "salario anual pos imposto R$"+posImposto);
       }else if(salario > 34712 && salario <= 68507){
           desconto = salario * 0.3735;
           posImposto = salario - desconto;
           System.out.println("salario anual R$" +salario+" imposto pago R$" +desconto+ "salario anual pos imposto R$"+posImposto);
       }else{
           desconto = salario * 0.4950 ;
           posImposto = salario - desconto;
           System.out.println("salario anual R$" +salario+" imposto pago R$" +desconto+ "salario anual pos imposto R$"+posImposto);
       }


    }
}
