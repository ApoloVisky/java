package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        // int, double, float, char, byte, short, long, boolean
        int idade = (int) 14000000000L; //casting força uma variavel a ser outra, não é o ideal de ser utilizad. É mais facil só mudar a classe da variavel
        long numeroGrande = 100000;
        double salarioDouble = 2000;
        float salarioFloat = 2500;
        byte idadeByte = 127;
        short idadeShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char carectere = 'M';

        System.out.println("A idade é: "+idade+" anos.");
        System.out.println("A idade é: "+numeroGrande+" anos.");
        System.out.println("A idade é: "+salarioDouble+" anos.");
        // escrever "sout" = System.out.println()

        String nome = "Olá, para escrever a string o S precisa ser maiusculo";
        System.out.println(nome);

    }
}
