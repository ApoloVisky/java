package academy.devdojo.maratonajava.javacore.Dconstrutores.Dominio;

public class Anime {

    private String tipo;
    private int episodios;
    private String nome;
    private String genero;
    private String estudio;

    public Anime(String nome, int episodios, String tipo, String genero){
        this();
        this.nome = nome;
        this.episodios = episodios;
        this.tipo = tipo;
        this.genero = genero;


    }

    public Anime(String nome, int episodios, String tipo, String genero, String estudio){
       //O this chama outro construtor e precisa sempres estar na primeira linha
        this(nome,episodios,tipo,genero);
        this.estudio = estudio;


    }


    public Anime(){
        System.out.println("Dentro do constructor vazio");
    }


    public void imprime(){
        System.out.println(this.tipo);
        System.out.println(this.episodios);
        System.out.println(this.nome);
        System.out.println(this.genero);

    }
//utiliza isso para nao precisar setar 3 vezes na classe test
   // public void init(String nome, int episodios, String tipo){
        //this.nome = nome;
        //this.episodios = episodios;
      //  this.tipo = tipo;

    //}

    //Sobrecarga de métodos
   // public void init(String nome, int episodios, String tipo, String genero){
       // this.nome = nome;
       // this.episodios = episodios;
     //   this.tipo = tipo;
   //     this.genero = genero;

    //}

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getNome(){
        return nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getEpisodios() {
        return episodios;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }
}
