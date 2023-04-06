import java.util.Scanner;

public class Main {
    public static String Categoria(int idade){
        if(idade >= 5 && idade <= 7 ){
            return "Infantil A";
        }
        if(idade >= 8 && idade <= 10 ){
            return "Infantil B";
        }
        if(idade >= 11  && idade <= 13 ){
            return "Juvenil A";
        }
        if(idade >= 14 && idade <= 17 ){
            return "Juvenil B";
        }
        if(idade >= 18) {
            return "Adulto";
        }
        else{
            return "Dados inválidos";
        }
    }
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        int idade = leitor.nextInt();
        String FuncaoRetorne = Categoria(idade);
        System.out.println(FuncaoRetorne);

    }
}