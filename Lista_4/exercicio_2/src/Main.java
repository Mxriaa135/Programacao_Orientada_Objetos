public class Main {
    public static void main(String[] args) {

        Musica musica1 = new Musica("There´s Nothing Holdin´Me Back",199,1616397814,"pop");
        Musica musica2 = new Musica("Mercy",208,1148863781,"pop");
        Musica musica3 = new Musica("Stitches",206,1587050765,"pop");
        Musica musica4= new Musica("Senõrita",190,239775220,"pop");

        Album album = new Album("Illuminate","Shawn Mendes");
        album.musicas.add(musica1);
        album.musicas.add(musica2);
        album.musicas.add(musica3);
        album.musicas.add(musica4);

        Musica MusicaMaiorPopularidade = album.getMusicaMaiorPopularidade();
        System.out.println("A música com maior popularidade é: " + MusicaMaiorPopularidade.getNome() + " com "
                + MusicaMaiorPopularidade.getPopularidade() + " de vizualizações");
        Musica MusicaMenorDuracao = album.getMusicaMenorDuracao();
        System.out.println("E a música com menor Duração é: " + MusicaMenorDuracao.getNome() + " com "
                + MusicaMenorDuracao.getDuracaoEmSegundos() + "s");
    }
}