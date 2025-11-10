package academy.devdojo.maratonajava.introducao;

import netscape.javascript.JSObject;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        //valores de inicializacao
        // byte, short, int, long, float e double = 0
        // char = '\i0000' ''
        // boolean = false
        // String = null

        String[] nomes = new String[4];
        nomes[0] = "Dante";
        nomes[1] = "Regis";
        nomes[2] = "Rodrigo";
        nomes[3] = "Murilo";


        for(int i =0 ; i < nomes.length ; i++){
            System.out.println(nomes[i]);

        }

    }
}
