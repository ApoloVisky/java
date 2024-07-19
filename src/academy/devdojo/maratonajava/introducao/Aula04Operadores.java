package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        // && (AND) || (or) !

        int idade = 35;
        float salario = 5000F;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario <= 3381;
        System.out.println(isDentroDaLeiMaiorQueTrinta);
        System.out.println(isDentroDaLeiMenorQueTrinta);

        double contaCorrente = 2000;
        double contaPoupanca = 10000;
        float valorPlaystation = 5000F;

        boolean isPlaystationCompravel = contaPoupanca > valorPlaystation || contaCorrente > valorPlaystation;
        System.out.println(isPlaystationCompravel);
    }
}
