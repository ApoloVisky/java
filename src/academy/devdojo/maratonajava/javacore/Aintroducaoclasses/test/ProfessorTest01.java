package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Mestre";
        professor.idade = 342;
        professor.sexo = 'M';

        System.out.print("Nome: "+professor.nome + " Idade: " + professor.idade + " Sexo: " + professor.sexo);

    }
}
