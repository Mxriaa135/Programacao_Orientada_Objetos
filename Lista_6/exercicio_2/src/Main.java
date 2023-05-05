public class Main {
    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado();
        Triangulo triangulo = new Triangulo();
        System.out.println("A área do Quadrado é: " + quadrado.CalcularArea(4, 8));
        System.out.println("A área do Triangulo é: " + triangulo.CalcularArea(6.5, 7));
    }
}