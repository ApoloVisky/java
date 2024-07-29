package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Calculadora {
    public  void somarDoisNumeros(){

        System.out.println(3 + 1);
    }
    public void subtraiDoisNumeros(){
        System.out.println(10-2);
    }

    public void multiplicaDoisNumeros(int num1, int num2){
        System.out.println(num1*num2);
    }

    public Double divisaoDoisNumeros(double num1, double num2){
        if (num2 == 0){
            return (double) 0;
        }
        return num1/num2;
    }

    public void alteraDoisNumeros(int numero1, int numero2){

        numero1 = 99;
        numero2 = 21;

        System.out.println("Dentro do alteraDoisNumeros");
        System.out.println("Num1"+numero1);
        System.out.println("Num2"+numero2);
    }
}
