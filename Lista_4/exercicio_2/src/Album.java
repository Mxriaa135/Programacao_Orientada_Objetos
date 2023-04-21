import java.util.ArrayList;
public class Album {
    private String nome;
    private String nomeArtista;
    public Album(String nome, String nomeArtista){
        this.nome = nome;
        this.nomeArtista = nomeArtista;
    }
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNomeArtista(){
        return this.nomeArtista;
    }
    public void setNomeArtista(String nomeArtista){
        this.nome = nomeArtista;
    }
    ArrayList<Musica> musicas = new ArrayList<>();
    public Musica getMusicaMaiorPopularidade(){
        int maiorPopularidade = 0;
        int index = 0;
        for(int i = 0; i < musicas.size(); i++){
            if(musicas.get(i).getPopularidade() > maiorPopularidade){
                maiorPopularidade = musicas.get(i).getPopularidade();
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
                menorDuracao = musicas.get(i).getDuracaoEmSegundos();
            }
            if(menorDuracao > musicas.get(i).getDuracaoEmSegundos()){
                menorDuracao = musicas.get(i).getDuracaoEmSegundos();
                index = i;
            }
        }
        return musicas.get(index);
    }
}
