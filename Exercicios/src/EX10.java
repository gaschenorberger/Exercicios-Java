/*
    O objetivo desse script é o usuário entrar com a cor do sinal e a velocidade,
    e com base nisso o sistema entrará num switch para o sinal, caso vermelho, amarelo e verde.
    Se passar no vermelho é multa, se passar no vermelho com velocidade nao permitida é 2x multa.
    Se estiver tudo ok o sistema vai falar que está tudo certo.
 */

import java.util.Scanner;

public class EX10 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int limiteVelocidade = 50;

        System.out.println("QUAL A COR DO SINAL? ('1' - Vermelho | '2' - Amarelo | '3' - Verde)");
        System.out.println("Digite o numero: ");
        int sinal = sc.nextInt();

        System.out.println("QUAL VELOCIDADE VOCE ESTA?");
        int velocidade = sc.nextInt();

        int multa = 0;
        switch (sinal) {
            case 1: // Vermelho

                if (velocidade > 0) { // Carro em movimento
                    System.out.println("Voce passou no sinal vermelho. Voce foi multado!");
                    multa++;
                    if (velocidade > limiteVelocidade) { // Checando se passou no sinal vermelho com velocidade nao permitida
                        System.out.println("Voce passou no sinal vermelho e ainda acima da velocidade. Voce foi multado 2x!");
                        multa++;
                    }
                }
                else {
                    System.out.println("OK, Ação correta");
                }

                break;

            case 2: // Amarelo

                if (velocidade > limiteVelocidade) {
                    System.out.println("Passou no sinal amarelo com velocidade acima do permitido. Voce foi multado!");
                    multa++;
                }
                else {
                    System.out.println("A velocidade esta OK, siga com atenção");
                }

                break;

            case 3: // Verde

                if (velocidade > limiteVelocidade) {
                    System.out.println("Voce passou no sinal verde, porém acima da velocidade. Voce foi multado!");
                    multa++;
                }
                else {
                    System.out.println("Tudo certo, pode prosseguir");
                }

                break;
        }

    }
}
