/*
    O objetivo desse script é converter 3 tipos de moedas (Real, Dolar, Euro).
    O usuário irá escolher a moeda de origem (moeda original que vai ser convertido),
    após isso ira entrar com a moeda final (moeda final para ser convertida) e por fim
    vai entrar com o valor. Exemplo: moeda original seria Dolar e moeda final Real,
    o usuário entra com valor de 1, o script vai retonar R$ 5,36, 1 dolar = R$ 5,36.
 */

import java.util.Scanner;

public class EX19 {

    // Váriaveis globais definidas com as taxas
    public static final double real_dolar = 0.19;
    public static final double real_euro = 0.16;

    public static final double dolar_real = 5.36;
    public static final double dolar_euro = 0.86;

    public static final double euro_real = 6.27;
    public static final double euro_dolar = 1.17;


    public static double converterMoeda(int moedaOrigem, int moedaFinal, double valorInicial){

        double valorConvertido = 0;
        switch (moedaOrigem){
            case 1: // Caso moeda REAL

                if (moedaFinal == 1) { // Se moeda final REAL | REAL -> REAL
                    valorConvertido = valorInicial;
                }
                else if (moedaFinal == 2) { // Se moeda final DOLAR | REAL -> DOLAR
                    valorConvertido = valorInicial * real_dolar;
                }
                else if (moedaFinal == 3) { // Se moeda final EURO | REAL -> EURO
                    valorConvertido = valorInicial * real_euro;
                }

                break;

            case 2: // Caso moeda DOLAR

                if (moedaFinal == 1) { // Se moeda final REAL | DOLAR -> REAL
                    valorConvertido = valorInicial * dolar_real;
                }
                else if (moedaFinal == 2) { // Se moeda final DOLAR | DOLAR -> DOLAR
                    valorConvertido = valorInicial;
                }
                else if (moedaFinal == 3) { // Se moeda final EURO | DOLAR -> EURO
                    valorConvertido = valorInicial * dolar_euro;
                }

                break;
            case 3: // Caso moeda EURO

                if (moedaFinal == 1) { // Se moeda final REAL | EURO -> REAL
                    valorConvertido = valorInicial * euro_real;
                }
                else if (moedaFinal == 2) { // Se moeda final DOLAR | EURO -> DOLAR
                    valorConvertido = valorInicial * euro_dolar;
                }
                else if (moedaFinal == 3) { // Se moeda final EURO | EURO -> EURO
                    valorConvertido = valorInicial;
                }

                break;

            default:
                System.out.println("VOCE DIGITOU O NÚMERO DA MOEDA DE ORIGEM ERRADO! ESCOLHA (1, 2, 3)");
                break;
        }
        return valorConvertido;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("CONVERSÃO DE MOEDAS");
        System.out.println("Qual é a moeda de origem? Ex: Real para Euro (Real é a origem)");
        System.out.println("'1' - REAL | '2' - DOLAR | '3' - EURO");

        int moedaOrigem = sc.nextInt();

        System.out.println("Qual é a moeda final? Ex: Real para Euro (Euro é a final)");
        System.out.println("'1' - REAL | '2' - DOLAR | '3' - EURO");

        int moedaFinal = sc.nextInt();

        System.out.println("Qual o valor que voce deseja converter?");
        double valorConverter = sc.nextDouble();


        if (moedaFinal == 1){
            System.out.println("O valor convertido é: R$ " + converterMoeda(moedaOrigem, moedaFinal, valorConverter));
        }
        else if (moedaFinal == 2){
            System.out.println("O valor convertido é: $ " + converterMoeda(moedaOrigem, moedaFinal, valorConverter));
        }
        else if (moedaFinal == 3) {
            System.out.println("O valor convertido é: € " + converterMoeda(moedaOrigem, moedaFinal, valorConverter));
        }
        else {
            System.out.println("VOCE DIGITOU O NÚMERO DA MOEDA FINAL ERRADO! ESCOLHA (1, 2, 3)");
        }
    }
}
