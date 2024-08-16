package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Pessoa {
    private String nome;
    private int idade;

    public void imprime(){

        System.out.println(this.nome);
        System.out.println(this.idade);
    }
//consigo setar um metodo privado
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
 //para retornar apenas o método

    public String getNome(){
        return this.nome;
    }
    public int getIdade(){
        return this.idade;
    }
}
