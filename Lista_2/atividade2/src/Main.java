import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int somatorioSalario = 0;
        int somatorioFilhos = 0;
        int maiorSalario = 0;
        for(int contador = 0; contador < 3; contador++) {
            Scanner leitor = new Scanner(System.in);
            System.out.println("Digite o salário do " + (contador + 1) + "º cidadão: ");
            int salario = leitor.nextInt();
            System.out.println("Digite o número de filhos do " + (contador + 1) + "º cidadão: ");
            int NumeroFilhos = leitor.nextInt();

            somatorioSalario = somatorioSalario + salario;
            somatorioFilhos = somatorioFilhos + NumeroFilhos;

            if(contador == 0){
                maiorSalario = salario;
            }
            if(salario > maiorSalario) {
                maiorSalario = salario;
            }
         }
        int mediaSalario = somatorioSalario/3;
        int mediaFilhos = somatorioFilhos/3;
        System.out.println("A média salarial é R$:" + mediaSalario);
        System.out.println("Média do número de filhos por habitante: " + mediaFilhos);
        System.out.println("Maior salário, R$:" + maiorSalario);

    }
}