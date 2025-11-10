package academy.devdojo.maratonajava.introducao;

import java.sql.SQLOutput;

public class Aula04Operadores {
    public static void main(String[] args) {
    // OPERADORES ARITIMETICOS
    /*
    ------------
         +
         -
         /
         *
    ------------
     */
        int numero1 = 10;
        int numero2 = 20;
        double res = numero1 / (double)numero2;

        double n3 = 10;
        double n4 = 20;
        double res2 = n3 / n4;

        System.out.println(res);
        System.out.println(res2);

        //-----------------------------------
        // OPERADORES RELACIONAIS
        /*
        ------------
             %
             <
             >
             <=
             >=
             !=
        ------------
        */
        int resto = numero1 % numero2;
        boolean teste = numero1 < numero2;
        System.out.println(resto);
        System.out.println(teste);

        boolean isDezMaiorQueVinte = 10 >20;
        boolean isDezMenorQueVinte = 10 <20;
        boolean isDezIgualQueVinte = 10 == 20;
        boolean isDezIgualQueDez = 10 == 10;
        boolean isDezDiferenteQueDez = 10 != 10;


        System.out.println("isDezMaiorQueVinte: "+isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte: "+isDezMenorQueVinte);
        System.out.println("isDezIgualQueVinte: "+isDezIgualQueVinte);
        System.out.println("isDezIgualQueDez: "+isDezIgualQueDez);
        System.out.println("isDezDiferenteQueDez: "+isDezDiferenteQueDez);

        //-------------------------------------------------

    }
}

