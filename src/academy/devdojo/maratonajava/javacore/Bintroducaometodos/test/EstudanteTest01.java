package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.ImprimeEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante2 = new Estudante();
       // ImprimeEstudante impressora = new ImprimeEstudante();

        estudante01.nome = "Adeilton";
        estudante01.idade = 21;
        estudante01.sexo = 'M';

        estudante2.nome = "Hellen";
        estudante2.idade = 22;
        estudante2.sexo = 'F';

       // impressora.imprime(estudante01);
        //impressora.imprime(estudante2);

       // impressora.imprime(estudante01);
       // impressora.imprime(estudante2);

        estudante01.imprime();
        estudante2.imprime();






    }
}
