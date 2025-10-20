/*
    O objetivo desse script é criar uma calculadora utilizando funções.
    Para cada operação foi feita uma função para ser chamada no código.
    Dentre elas (somar, subtrair, multiplicar e dividir)
    Para chamar essas funções, deve se chamar o objeto da classe (EX17Calculadora - calculadora)
    calculadora.somar(numero1, numero2), dois parâmetros para realizar a conta.
 */

import java.util.Scanner;

public class EX17Caluladora {

    private String nomeDaCalculadora = "Calculadora"; // Escopo global

    public double somar(double numero1, double numero2){
        double resultadoSoma = numero1 + numero2; // Local
        return resultadoSoma;
    }

    public double subtrair(double numero1, double numero2){
        double resultadoSubtr = numero1 - numero2;
        return resultadoSubtr;
    }

    public double multiplicar(double numero1, double numero2){
        double resultadoMulti = numero1 * numero2;
        return resultadoMulti;
    }

    public double divisao(double numero1, double numero2){
        double resultadoDivi = numero1 / numero2;
        return resultadoDivi;
    }

    public void exibirNome(){
        System.out.println("Este programa é a " + this.nomeDaCalculadora);
    }


    public static void main(String[] args){

        EX17Caluladora calculadora = new EX17Caluladora();
        Scanner sc = new Scanner(System.in);

        calculadora.exibirNome();

        System.out.println("Entre com o numero 1: ");
        double numero1 = sc.nextDouble();

        System.out.println("Entre com o numero 2: ");
        double numero2 = sc.nextDouble();

        System.out.println("Escolha a operação: (1 - SOMAR | 2 - SUBTRAIR | 3- MULTIPLICAR | 4 - DIVIDIR");
        int operacao = sc.nextInt();

        switch (operacao) {

            case 1: // somar
                double soma = calculadora.somar(numero1, numero2);
                System.out.printf("A soma de %.1f + %.1f é: %.1f",numero1, numero2, soma);

                break;
            case 2: // subtrair
                double subtrair = calculadora.subtrair(numero1, numero2);
                System.out.printf("A subtração de %.1f - %.1f é: %.1f", numero1, numero2, subtrair);

                break;
            case 3: // multiplicar
                double multiplicar = calculadora.multiplicar(numero1, numero2);
                System.out.printf("A multiplicação de %.1f * %.1f é: %.1f", numero1, numero2, multiplicar);

                break;
            case 4: // dividir
                double dividir = calculadora.divisao(numero1, numero2);
                System.out.printf("A divisão de  %.1f / %.1f é: %.1f",numero1, numero2, dividir);

                break;
            default:
                System.out.println("VOCE DIGITOU A OPERAÇÃO ERRADA!");
        }
    }
}
