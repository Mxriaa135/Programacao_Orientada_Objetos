import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {

        Heroi heroi1= new Heroi();
        heroi1.nome = "Steven";
        heroi1.ataque = 15;
        heroi1.defesa = 20;
        heroi1.pontos = 15;

        Heroi heroi2= new Heroi();
        heroi2.nome = "Henry";
        heroi2.ataque = 50;
        heroi2.defesa = 20;
        heroi2.pontos = 40;

        Heroi heroi3= new Heroi();
        heroi3.nome = "Rex";
        heroi3.ataque = 35;
        heroi3.defesa = 65;
        heroi3.pontos = 10;

        Heroi heroi4= new Heroi();
        heroi4.nome = "Peter";
        heroi4.ataque = 65;
        heroi4.defesa = 15;
        heroi4.pontos = 30;

        Inimigo inimigo1 = new Inimigo();
        inimigo1.ataque = 10;
        inimigo1.defesa = 20;
        inimigo1.pontos = 15;

        Inimigo inimigo2 = new Inimigo();
        inimigo2.ataque = 25;
        inimigo2.defesa = 10;
        inimigo2.pontos = 30;

        Inimigo inimigo3 = new Inimigo();
        inimigo3.ataque = 45;
        inimigo3.defesa = 60;
        inimigo3.pontos = 80;

        Inimigo inimigo4 = new Inimigo();
        inimigo4.ataque = 8;
        inimigo4.defesa = 5;
        inimigo4.pontos = 2;

        Mapa mapa = new Mapa();
        mapa.nome = "Torre do guardião";
        mapa.altura = 1000;
        mapa.largura = 1000;

        mapa.inimigos.add(inimigo1);
        mapa.inimigos.add(inimigo2);
        mapa.inimigos.add(inimigo3);
        mapa.inimigos.add(inimigo4);

        mapa.herois.add(heroi1);
        mapa.herois.add(heroi2);
        mapa.herois.add(heroi3);
        mapa.herois.add(heroi4);

        Inimigo InimigoDeMaiorAtaque = mapa.getInimigoMaiorAtaque();
        System.out.println("O inimigo de maior ataque possui: " + InimigoDeMaiorAtaque.ataque + " de poder!");


    }
}