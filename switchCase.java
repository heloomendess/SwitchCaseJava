import java.util.Scanner;

public class switchCase {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Escreva um valor de 1 a 7 que corresponde a um dia da semana: ");
        int valor = entrada.nextInt();

        switch (valor) {
            case 1:
                System.out.println("Hoje é: Domingo.");
            break;
            case 2:
                System.out.println("Hoje é: Segunda-feira.");
            break;
            case 3:
                System.out.println("Hoje é: Terça-feira.");
            break;
            case 4:
                System.out.println("Hoje é: Quarta-feira.");
            break;
            case 5:
                System.out.println("Hoje é: Quinta-feira");
            break;
            case 6:
                System.out.println("Hoje é: Sexta-feira.");
            break;
            case 7:
                System.out.println("Hoje é: Sábado.");
            break;
            default:
                System.out.println("Valor inválido.");

        }
        entrada.close();
    }
}
