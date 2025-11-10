package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        // int, double, float, char, byte, short, long, boolean

        int age = (int) 10000000000L; //(int) casting = forcar uma variavel q nao cabe
        long numeroGrande = 100000;
        double salarioDouble = 2000.2; // decimais
        float salarioFloat = (float) 12500.021D; // decimais adicionar um "F" para mostrar q e um decimal
        byte idadeByte = 127; //so vai ate aqui passou fudeo
        short idadeShort = 32767;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 65; // usa aspas simples ''

        String name = "Rodrigo"; // usa aspas duplas ""

        System.out.println("A idade é "+age + " anos");
        System.out.println(verdadeiro);
        System.out.println("char: "+caractere);
        System.out.println(salarioFloat);
        System.out.println("OI meu nome é "+name);
    }
}
