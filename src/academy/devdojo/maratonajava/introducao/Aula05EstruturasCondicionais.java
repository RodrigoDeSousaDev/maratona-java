package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais {
    public static void main(String[] args) {
        int age = 20;
        boolean autorizacao = age < 18;
        if (age == 9) {
            System.out.println("caralo");
        }
        if (age == 10) System.out.println("oi");

        if(!autorizacao){
            System.out.println("ta chapando");
        }

    }
}
