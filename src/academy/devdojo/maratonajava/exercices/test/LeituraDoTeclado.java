package academy.devdojo.maratonajava.exercices.test;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Scanner;

public class LeituraDoTeclado {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite sua pergunta e eu responderei sim ou não");
        input.nextLine();

        int resp = (int)(Math.random() * 2) + 1;

        if(resp == 1){
            System.out.println("SIM");
        }else {
            System.out.println("NÃO");
        }
    }
}
