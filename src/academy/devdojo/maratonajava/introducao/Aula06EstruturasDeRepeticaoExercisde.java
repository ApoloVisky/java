package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticaoExercisde {
    public static void main(String[] args) {
        double valorTotal = 30000;

        for (int Parcela = 1; Parcela <= valorTotal; Parcela++) {
            double valorParcela = valorTotal / Parcela;
            if (valorParcela >= 1000) {
                System.out.println("Parcela "+ Parcela+ " R$ "+valorParcela);

            } else {break;}


            }
        }
    }
