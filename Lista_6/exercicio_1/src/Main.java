public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro(1,300,7);
        Moto moto = new Moto(2,280, 9);
        carro.utilizarHabilidadeEspecial();
        moto.utilizarHabilidadeEspecial();
    }
}