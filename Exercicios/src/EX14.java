/*
    O objetivo principal desse script é simular o lançamento de dados.
    Foi utilizado a biblioteca Random para deixar os dados aleatórios.
    O script só vai parar de rodar quando a soma dos dois dados der 7,
    caso contrário ele vai continuar rodando, porém no fim de cada lançamento
    é feita a pergunta para o usuário se ele quer continuar jogando.
    Quando a soma der 7, ele vai dar a mensagem dizendo que acertou 7 com X tentativas.
 */

import java.util.Random;
import java.util.Scanner;

public class EX14 {
    public static void main(String[] args){

        Random geradorDados = new Random(); // utilizando random para jogar numeros aleatorios com os dados
        Scanner sc = new Scanner(System.in);

        int soma = 0;
        int tentativa = 0;
        do {

            int dado1 = geradorDados.nextInt(7);
            int dado2 = geradorDados.nextInt(7);

            System.out.printf("Lançamento dos dados - Dado 1: %d, Dado 2: %d\n", dado1, dado2);

            if (dado1 == dado2) {
                System.out.println("Voce tirou um par. Continuando");
                continue;
            }
            else {
                soma = dado1 + dado2;

                if (soma == 7){
                    System.out.printf("PARABÉNS, VOCE TIROU 7 APÓS %d TENTATIVAS", tentativa);
                }
                else {
                    System.out.printf("A soma dos dois deu %d\n\n", soma);
                    tentativa++;

                    System.out.println("Deseja continuar? ('1' para sim, '0' para não)");
                    int continuar = sc.nextInt();

                    if (continuar == 1){ // Definindo se o usuário quer continuar jogando ou não
                        System.out.println("\n");
                        continue;
                    }
                    else {
                        break;
                    }
                }
            }
        } while (soma != 7);
    }
}
