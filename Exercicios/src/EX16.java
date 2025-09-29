/*
    O objetivo desse Script é criar um analisador de sequência Fibonacci.
    O usuário entra com um limite para essa sequencia e com base nisso é feito
    2 while, 1 para iniciar normal o 'anteriorNum' e 'atualNum' e o outro para
    fazer um loop ate estourar o limite que o usuário digitou.
 */

import java.util.Scanner;

public class EX16 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("Qual o limite da sequência?");
            int limite = sc.nextInt();

            int anteriorNum = 0;
            int atualNum = 1;

            System.out.print("Sequência (ímpares) até " + limite + ": ");
            System.out.print(anteriorNum + " " + atualNum + " ");

            while (true){
                int proximoNum = anteriorNum + atualNum;

                anteriorNum = atualNum; // o numero atual vira o anterior após o proximo numero ser definido
                atualNum = proximoNum; // o atual numero agora é o numero que foi definido na variavel proximoNum

                if (atualNum >= limite){
                    break;
                }

                if (atualNum % 2 == 0){
                    continue;
                }

                System.out.print(atualNum + " ");

            }

            System.out.println("\nGerar outra sequencia? '1' para sim ou '0' para não");
            int saida = sc.nextInt();

            if (saida == 0) {
                break;
            }

        }
    }
}
