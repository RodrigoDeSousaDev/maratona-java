package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao01 {
    public static void main(String[] args) {
        // while, do while and for

        int count = 0;

        while(count < 10){
            System.out.println("dentro do while: "+ ++count);

        }

        count = 0;

        do {
            System.out.println("dentro do do-while: "+ count);
            count++;
        }while (count <= 10);

        count = 0;
        //------------FOR---------
        // variavel incrementada / ate onde a variavel vai // como vai alterar o status da variavel

        for (int i=0 ; i<=10 ; i++){
            System.out.println("for "+i);
        }
    }
}
