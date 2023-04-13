public class Main {
    public static void main(String[] args) {

        Musica musica1 = new Musica();
        musica1.nome = "There´s Nothing Holdin´Me Back";
        musica1.duracaoEmSegundos = 199;
        musica1.popularidade = 1616397814;
        musica1.genero = "pop";
        musica1.album = new Album();
        musica1.album.nome = "Illuminate";
        musica1.album.nomeArtista = "Shawn Mendes";

        Musica musica2 = new Musica();
        musica2.nome = "Mercy";
        musica2.duracaoEmSegundos = 208;
        musica2.popularidade = 1148863781;
        musica2.genero = "pop";
        musica2.album = new Album();
        musica2.album.nome = "Illuminate";
        musica2.album.nomeArtista = "Shawn Mendes";

        Musica musica3 = new Musica();
        musica3.nome = "Stitches";
        musica3.duracaoEmSegundos = 206;
        musica3.popularidade = 1587050765;
        musica3.genero = "pop";
        musica3.album = new Album();
        musica3.album.nome = "Handwritten";
        musica3.album.nomeArtista = "Shawn Mendes";

        Musica musica4= new Musica();
        musica4.nome = "Senõrita";
        musica4.duracaoEmSegundos = 190;
        musica4.popularidade = 239775220;
        musica4.genero = "pop";
        musica4.album = new Album();
        musica4.album.nome = "Shawn Mendes (Deluxe)";
        musica4.album.nomeArtista = "Shawn Mendes";

        Album album = new Album();
        album.musicas.add(musica1);
        album.musicas.add(musica2);
        album.musicas.add(musica3);
        album.musicas.add(musica4);

        Musica MusicaMaiorPopularidade = album.getMusicaMaiorPopularidade();
        System.out.println("A música com maior popularidade é: " + MusicaMaiorPopularidade.nome + " com "
                            + MusicaMaiorPopularidade.popularidade + " de vizualizações");
        Musica MusicaMenorDuracao = album.getMusicaMenorDuracao();
        System.out.println("E a música com menor Duração é: " + MusicaMenorDuracao.nome + " com "
                            + MusicaMenorDuracao.duracaoEmSegundos + "s");
    }
}