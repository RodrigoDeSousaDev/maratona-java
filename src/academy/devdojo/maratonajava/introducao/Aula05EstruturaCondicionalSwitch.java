package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturaCondicionalSwitch {
    public static void main(String[] args) {
        // imprima o dia da semana considerando 1 como domingo

        byte dia = 12;
        char sexo = 'm';

        //char, int, byte, short, enum, String
        switch (dia){
            default:
                System.out.println("Opcao invalida");
            break;
            case 1:
                System.out.println("domingo");
                break;
            case 2:
                System.out.println("segunda");
                break;
            case 3:
                System.out.println("terça");
                break;
            case 4:
                System.out.println("quarta");
                break;
            case 5:
                System.out.println("quinta");
                break;
            case 6:
                System.out.println("sexta");
                break;
            case 7:
                System.out.println("sabado");
                break;

        }

        switch (sexo){
            case 'm':
                System.out.println("homi");
                break;
            case 'f':
                System.out.println("muie");
                break;
        }

    }
}
