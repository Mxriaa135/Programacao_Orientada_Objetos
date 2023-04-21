import java.util.ArrayList;
public class Mapa {
    private String nome;
    private int altura;
    private int largura;
    public Mapa(String nome, int altura, int largura){
        this.nome = nome;
        this.altura = altura;
        this.largura = largura;
    }
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public int getAltura(){
        return this.altura;
    }
    public void setAltura(int altura){
        this.altura = altura;
    }
    public int getLargura(){
        return this.largura;
    }
    public void setLargura(int largura){
        this.largura = largura;
    }
    ArrayList<Inimigo> inimigos = new ArrayList<>();
    ArrayList<Heroi> herois = new ArrayList<>();

    public Inimigo getInimigoMaiorAtaque(){
        int maiorAtaque = 0;
        int index = 0;
        for(int i = 0; i < inimigos.size(); i++){
            if(inimigos.get(i).getAtaque() > maiorAtaque){
                maiorAtaque = inimigos.get(i).getAtaque();
                index = i;
            }
        }
        return inimigos.get(index);
    }
}
