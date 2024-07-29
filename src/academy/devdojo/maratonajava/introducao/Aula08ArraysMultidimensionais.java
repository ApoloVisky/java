package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidimensionais {
    public static void main(String[] args) {
        int[][] number = new int[3][3];

        number[0][0] = 21;
        number[0][1] = 27;
        number[0][2] = 24;

        number[1][0] = 65;
        number[1][1] = 32;
        number[1][2] = 54;

        number[2][0] = 87;
        number[2][1] = 63;
        number[2][2] = 42;

        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < number[i    ].length; j++) {
                System.out.println(number[i][j]);
            }

            System.out.println("--------------------");

            for (int[] arrBase : number){
                for (int num: arrBase){
                    System.out.println(num);
                }
            }
        }
    }
}
