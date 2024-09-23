import java.util.Random;
import java.util.Scanner;


public class JogoAdivinhacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        // O computador escolhe um número entre 1 e 100
        int numeroSorteado = random.nextInt(100) + 1;
        int tentativasMaximas = 12;
        int tentativas = 0;
        boolean adivinhou = false;

        System.out.println("Bem-vindo ao jogo de adivinhação!");
        System.out.println("Tente adivinhar um número entre 1 e 100.");
        System.out.println("Você tem " + tentativasMaximas + " tentativas.");

        // Laço para permitir que o jogador faça tentativas
        while (tentativas < tentativasMaximas) {
            System.out.print("Digite seu palpite: ");
            int palpite = scanner.nextInt();
            tentativas++;

            // Condicionais para verificar se o palpite está correto
            if (palpite < 1 || palpite > 100) {
                System.out.println("Por favor, escolha um número entre 1 e 100.");
            } else if (palpite < numeroSorteado) {
                System.out.println("Seu palpite é menor que o número sorteado.");
            } else if (palpite > numeroSorteado) {
                System.out.println("Seu palpite é maior que o número sorteado.");
            } else {
                adivinhou = true;
                break; // O jogador acertou
            }
        }

        // Mensagem final
        if (adivinhou) {
            System.out.println("Parabéns! Você adivinhou o número " + numeroSorteado + " em " + tentativas + " tentativas.");
        } else {
            System.out.println("Você esgotou suas tentativas. O número sorteado era " + numeroSorteado + ".");
        }

        scanner.close();
    }
}

