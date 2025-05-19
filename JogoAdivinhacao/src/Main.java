import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String jogarNovamente;
        do {
            int numeroSecreto = (int) (Math.random() * 100) + 1;
            int palpite = 0;
            int tentativas = 0;
            int maxtentativas = 5;

            System.out.println("\nBem Vindo ao Jogo de Adivinhação!");
            System.out.println("Você tem " + maxtentativas + " tentativas para acertar o número entre 1 e 100");

            while (palpite != numeroSecreto && tentativas < maxtentativas) {
                System.out.println("Digite um número: ");
                palpite = teclado.nextInt();
                tentativas++;

                if (palpite == numeroSecreto) {
                    System.out.println("Parabéns! Vovê acertou " + numeroSecreto + " de " + maxtentativas + " tentativas");

                } else if (palpite < numeroSecreto) {
                    System.out.println("O número é maior!");
                } else {
                    System.out.println("O número é menor!");
                }
            }
                if (palpite != numeroSecreto) {
                    System.out.println("Suas tentativas acabaram! O número certo era " + numeroSecreto);
                }
                //perguntar se deseja hogar novamente
                System.out.println("Deseja jogar novamente? (s/n): ");
                jogarNovamente = teclado.next();
            }
            while (jogarNovamente.equals("s")) ;

            System.out.println("Obrigado por jogar!");

            teclado.close();

    }
}