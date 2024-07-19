package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        double salario = 6000;

        String podeDoar = "Posso fazer a doação de 500 reais";
        String naoPodeDoar = "Não consigo fazer a doação";
//Operador ternario subistitiu o IF
        String resultado = salario > 5000 ? podeDoar : naoPodeDoar;
        System.out.println(resultado);
    }
}
