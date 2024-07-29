package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Carro carro2 = new Carro();

        carro.marca = "Ferrari";
        carro.ano = 2023;
        carro.modelo = "Spider";

        carro2.marca = "koenigsegg";
        carro2.modelo = "Jesko";
        carro2.ano = 2020;


        carro = carro2;


        System.out.println("Carro 1");
        System.out.println(carro.ano);
        System.out.println(carro.modelo);
        System.out.println(carro.marca);


        System.out.println("\nCarro 2");
        System.out.println(carro2.marca);
        System.out.println(carro2.ano);
        System.out.println(carro2.modelo);
    }
}
