/*
    O objetivo principal desse script é pedir para o usuário inserir os coeficientes,
    calcular o valor do discriminante, analisar e informar se a equação possui duas raizes reais,
    uma raiz real ou nenhuma.
 */

import java.util.Scanner;

public class EX8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com o valor de A:");
        double a = sc.nextDouble();

        System.out.println("Entre com o valor de B:");
        double b = sc.nextDouble();

        System.out.println("Entre com o valor de C:");
        double c = sc.nextDouble();

        if (a == 0) {
            System.out.println("\nO coeficiente A não pode ser zero");
        }

        else {
            double discriminante = (b * b) - (4 * a * c);

            System.out.println("\nO valor do discriminante é: " + discriminante);

            // Condicional para verificar quantidade de raizes
            if (discriminante > 0) {
                System.out.println("A equação possui duas raizes reais e distintas");
            }
            else if (discriminante == 0) {
                System.out.println("A equação possui uma raiz real (ou duas raizes reais iguais)");
            }
            else {
                System.out.println("A equação não possui raizes reais");
            }
        }
    }
}
