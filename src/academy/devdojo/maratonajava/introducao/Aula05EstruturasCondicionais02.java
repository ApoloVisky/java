package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args) {
        int idade = 124;

        if (idade <=15){
            System.out.println("O jogador irá para a base infantil");
        } else if (idade > 16 && idade < 21) {
            System.out.println("O jogador irá para a base infanto juvenil");

        }else {
            System.out.println("O jogador irá para a base adulta");
        }

    }
}
