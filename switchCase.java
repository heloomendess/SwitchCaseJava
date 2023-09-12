import java.util.Scanner;
public class switchCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        int n1 = input.nextInt();

        System.out.print("Digite a segunda nota: ");
        int n2 = input.nextInt();

        int media = (n1 + n2)/2;

        if (media > 9) {
            media = 'A';
        } else if (media >= 8) {
            media = 'B';
        } else if (media >= 7) {
            media = 'C';
        } else if (media >= 6) {
            media = 'D';
        } else {
            media = 'E';
        }
        switch (media) {
           case 'A':
                    System.out.println("Sua nota foi A, excelente!");
                break;
           case 'B':
                    System.out.println("Sua nota foi B, excelente!");
                break;
            case 'C':
                    System.out.println("Sua nota foi C, bem feito!");
                break;
            case 'D':
                    System.out.println("Sua nota foi D, você passou!");
                break;
            case 'E':
                    System.out.println("Sua nota foi E, melhor tentar novamente!");
                break;
            default:
                    System.out.println("Conceito inválido.");       
        }
        input.close();
    }
}