import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {

        Heroi Steven= new Heroi(15, 20, 15);
        Heroi Henry= new Heroi(50, 20, 40);
        Heroi Rex= new Heroi(35, 65, 10);
        Heroi Peter= new Heroi(65, 15, 30);
        Inimigo inimigo1 = new Inimigo( 10, 20, 15);
        Inimigo inimigo2 = new Inimigo(25, 10, 30);
        Inimigo inimigo3 = new Inimigo(45, 60, 80);
        Inimigo inimigo4 = new Inimigo(8, 5, 2);
        Mapa mapa = new Mapa("Torre do guardião", 1000, 1000);

        mapa.inimigos.add(inimigo1);
        mapa.inimigos.add(inimigo2);
        mapa.inimigos.add(inimigo3);
        mapa.inimigos.add(inimigo4);
        mapa.herois.add(Steven);
        mapa.herois.add(Henry);
        mapa.herois.add(Rex);
        mapa.herois.add(Peter);

        Inimigo InimigoDeMaiorAtaque = mapa.getInimigoMaiorAtaque();
        System.out.println("O inimigo de maior ataque possui: " + InimigoDeMaiorAtaque.getAtaque() + " de poder!");
    }
}