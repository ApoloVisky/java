package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.test;

import academy.devdojo.maratonajava.javacore.Fmodificadorestatico.domain.Carro;

public class TestCarro01 {

    public static void main(String[] args) {
        Carro c1 = new Carro("BMW", 280);
        Carro c2 = new Carro("Audi", 290);
        Carro c3 = new Carro("Bugatti", 295);

        c1.imprime();
        c2.imprime();
        c3.imprime();

    }



}
