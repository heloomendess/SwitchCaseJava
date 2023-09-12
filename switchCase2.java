import java.util.Scanner;
public class switchCase2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Escreva o código do produto: ");
        int produto = input.nextInt();

        switch (produto) {
            case 1: 
                    System.out.println("Alimento não perecível.");
                break;
            case 2: 
            case 3:
            case 4:
                    System.out.println("Alimento perecivel.");
                break;
            case 5:
            case 6:  
                    System.out.println("Vestuário.");
                break;
            case 7:
                    System.out.println("Higiene Pessoal.");
                break;
            case 8:
            case 9:
            case 10:
            case 11: 
            case 12:
            case 13:
            case 14:
            case 15:
                    System.out.println("Limpeza e utensílios domésticos.");
            default: 
                    System.out.println("Código inválido.");                                        
        }

        input.close();
    }
}
