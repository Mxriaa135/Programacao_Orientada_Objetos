import java.util.ArrayList;
public class Album {
    String nome;
    String nomeArtista;
    ArrayList<Musica> musicas = new ArrayList<>();
    public Musica getMusicaMaiorPopularidade(){
        int maiorPopularidade = 0;
        int index = 0;
        for(int i = 0; i < musicas.size(); i++){
            if(musicas.get(i).popularidade > maiorPopularidade){
                maiorPopularidade = musicas.get(i).popularidade;
                index = i;
            }
        }
        return musicas.get(index);
    }
    public Musica getMusicaMenorDuracao(){
        int menorDuracao = 0;
        int index = 0;
        for(int i = 0; i < musicas.size(); i++){
            if(i == 0){
                menorDuracao = musicas.get(i).duracaoEmSegundos;
            }
            if(menorDuracao > musicas.get(i).duracaoEmSegundos){
                menorDuracao = musicas.get(i).duracaoEmSegundos;
                index = i;
            }
        }
        return musicas.get(index);
    }
}
