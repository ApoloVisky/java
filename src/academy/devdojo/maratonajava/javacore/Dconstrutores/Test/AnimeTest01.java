package academy.devdojo.maratonajava.javacore.Dconstrutores.Test;


import academy.devdojo.maratonajava.javacore.Dconstrutores.Dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Jujutsu Kaisen 2", 12, "TV", "Ação","Gible");


//        anime.init("Jujutsu Kaise", 12,"TV");
      //  anime.init("Jujutsu Kaisen 2", 12, "TV", "Ação");
        anime.imprime();

    }
}
