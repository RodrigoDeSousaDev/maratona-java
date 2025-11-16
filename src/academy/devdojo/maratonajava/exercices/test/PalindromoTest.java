package academy.devdojo.maratonajava.exercices.test;

public class PalindromoTest {

    public static void main(String[] args) {
        String palavra = "ovo";
        String inverso = "";

        for (int i = palavra.length()-1; i >= 0  ; i--) {
            inverso += palavra.charAt(i);
        }


        if(inverso.equals(palavra)){
            System.out.println("A palavra: "+palavra+" é um palindromo");
        }else{
            System.out.println("A palavra: "+palavra+" não é um palindromo");
        }

    }
}
