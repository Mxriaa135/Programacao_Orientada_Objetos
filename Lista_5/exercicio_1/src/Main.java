public class Main {
    public static void main(String[] args) {
        Grupo grupo = new Grupo();
        grupo.adicionarHeroi(new Heroi(1, "Steven", 100));
        grupo.adicionarHeroi(new Heroi(2,"Alex",200));
        grupo.adicionarHeroi(new Heroi(3, "Henry", 300));
        grupo.adicionarHeroi(new Heroi(3, "Henry", 300));

        grupo.removerHeroi(1);
        System.out.println("O total de moedas do grupo é de " + grupo.getTotalMoedasDeOuro());
    }
}
