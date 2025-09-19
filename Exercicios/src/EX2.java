/*
    O Objetivo principal desse script é a conversão de temperaturas.
    O usuário entra com a unidade principal, digita a temperatura e depois entra com a unidade que quer converter.
    Por exemplo: Entrou com Celsius 30 graus e escolheu a unidade Fahrehreit, o resultado final será 86 fahrenheit.
    E assim para todas as unidades (Celsius x Fahrenheit x Kelvin)
*/


import java.util.Scanner;

public class EX2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Qual a unidade de origem?: (1-CELSIUS  2-FAHRENHEIT  3-KELVIN)");
        System.out.println("Digite (1 ou 2 ou 3)");
        int unidadeOrigem = sc.nextInt();


        // Tornando variaveis globais antes de iniciar o switch
        int celsius = 0;
        int fahrenheit = 0;
        int kelvin = 0;

        switch (unidadeOrigem) {
            case 1: // Caso celsius
                System.out.println("Quantos graus Celsius? (Utilize numeros inteiros)");
                celsius = sc.nextInt();
                break;

            case 2: // Caso fahrenheit
                System.out.println("Quantos graus Fahrenheit? (Utilize numeros inteiros)");
                fahrenheit = sc.nextInt();
                break;

            case 3: // Caso kelvin
                System.out.println("Quantos graus Kelvin? (Utilize numeros inteiros)");
                kelvin = sc.nextInt();
                break;

            default:
                System.out.println("Voce digitou o numero errado!");
        }


        System.out.println("Qual a unidade de destino? (1-CELSIUS  2-FAHRENHEIT  3-KELVIN)");
        System.out.println("Digite (1 ou 2 ou 3)");
        int unidadeDestino = sc.nextInt();

        
        // Validação de unidades

        if ((unidadeOrigem == 1) && (unidadeDestino == 2)) { // Celsius x Fahrenheit
            double temperatura = ((celsius * 1.8) + 32);

            System.out.println("\nCelsius -> Fahrenheit");
            System.out.println(celsius + " graus celsius convertido para Fahrenheit: " + temperatura);
        }

        else if ((unidadeOrigem == 1) && (unidadeDestino == 3)){ // Celsius x Kelvin
            double temperatura = celsius + 273.15;

            System.out.println("\nCelsius -> Kelvin");
            System.out.println(celsius + " graus celsius convertido para Kelvin: " + temperatura);
        }

        else if ((unidadeOrigem == 2) && (unidadeDestino == 1)) { // Fahrenheit x Celsius
            double temperatura = ((fahrenheit - 32) * (5.0 / 9.0));

            System.out.println("\nFahrenheit -> Celsius");
            System.out.println(fahrenheit + " fahrenheit convertido para Celsius: " + temperatura);
        }

        else if ((unidadeOrigem == 2) && (unidadeDestino == 3)) { // Fahrenheit x Kelvin
            double temperatura = (5.0/9.0 * (fahrenheit - 32)) + 273.15;

            System.out.println("\nFahrenheit -> Kelvin");
            System.out.println(fahrenheit + " fahrenheit convertido para Kelvin: " + temperatura);
        }

        else if ((unidadeOrigem == 3) && (unidadeDestino == 1)) { // Kelvin x Celsius
            double temperatura = kelvin - 273.15;

            System.out.println("\nKelvin -> Celsius");
            System.out.println(kelvin + " kelvins convertido para Celsius: " + temperatura);
        }

        else if ((unidadeOrigem == 3) && (unidadeDestino == 2)) { // Kelvin x Fahrenheit
            double temperatura = (kelvin - 273.15) * 1.8 + 32;

            System.out.println("\nKelvin -> Fahrenheit");
            System.out.println(kelvin + " kelvins convertido para Fahrenheit: " + temperatura);
        }


        // CASO AS UNIDADES FOREM IGUAIS

        else if (unidadeOrigem == 1 && unidadeDestino == 1) { // Celsius x Celsius
            System.out.println("\nCelsius -> Celsius");
            System.out.println(celsius + " graus Celsius");
        }

        else if (unidadeOrigem == 2 && unidadeDestino == 2) { // Fahrenheit x Fahrenheit
            System.out.println("\nFahrenheit -> Fahrenheit");
            System.out.println(fahrenheit + " Fahrenheit");
        }

        else if (unidadeOrigem == 3 && unidadeDestino == 3) { // Kelvin x Kelvin
            System.out.println("\nKelvin -> Kelvin");
            System.out.println(kelvin);
        }
    }
}