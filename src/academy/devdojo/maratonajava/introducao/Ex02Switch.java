package academy.devdojo.maratonajava.introducao;

public class Ex02Switch {
    public static void main(String[] args) {
        // dado os valores de um a 7 imprima se é dia util ou final de semana
        // considerando 1 como domingo

        byte dia = 3;
        switch (dia){
            case 1:
            case 7:
                System.out.println("dia inutil");
                break;

            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("dia util");
                break;
            default:
                System.out.println("opcao invalida");
                break;

        }
    }
}
