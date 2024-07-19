package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionaisExercise {
    public static void main(String[] args) {
        float salarioAnual = 454.000F;
        String taxaBaixa = "Você irá pagar 9.70% de imposto anual";
        String mediaTaxa = "Você irá pagar 37.15% de imposto anual";
        String altaTaxa = "Você irá pagar 49.50% de imposto anual";

        if (salarioAnual < 34.712){
            System.out.println(taxaBaixa);
        } else if (salarioAnual > 34.712 && salarioAnual < 68.507) {
            System.out.println(mediaTaxa);
        } else {
            System.out.println(altaTaxa);
        }
    }
}
