import java.util.Scanner;
public class questao {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual é o resultado da raiz quadrada de 4?: ");
        System.out.println("a) 5");
        System.out.println("b) 4");
        System.out.println("c) 3");
        System.out.println("d) 2");
        System.out.println("e) 1");

        System.out.println("Digite sua resposta: ");
        int resposta = entrada.nextInt();

        switch (resposta) {
            case 2:
                System.out.println("Resposta correta!");
            break;
            default:
                System.out.println("Resposta incorreta.");
        }
    }
}
