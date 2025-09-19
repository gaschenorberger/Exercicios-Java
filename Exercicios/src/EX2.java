import java.util.Scanner;

public class EX2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Qual a unidade de origem?: (1-CELSIUS  2-FAHRENHEIT  3-KELVIN)");
        System.out.println("Digite (1 ou 2 ou 3)");
        int unidadeOrigem = sc.nextInt();

        int temperaturaOrigem = 0;
        switch (unidadeOrigem) {
            case 1:
                System.out.println("Quantos graus Celsius? (Utilize numeros inteiros)");
                int celsius = sc.nextInt();

                temperaturaOrigem = celsius;
                break;

            case 2:
                System.out.println("Quantos graus Fahrenheit? (Utilize numeros inteiros)");
                int fahrenheit = sc.nextInt();

                temperaturaOrigem = fahrenheit;
                break;

            case 3:
                System.out.println("Quantos graus Kelvin? (Utilize numeros inteiros)");
                int kelvin = sc.nextInt();

                temperaturaOrigem = kelvin;
                break;

            default:
                System.out.println("Voce digitou o numero errado!");
        }


        System.out.println("Qual a unidade de destino? (1-CELSIUS  2-FAHRENHEIT  3-KELVIN)");
        System.out.println("Digite (1 ou 2 ou 3)");
        int unidadeDestino = sc.nextInt();


        if ((unidadeOrigem == 1) && (unidadeDestino == 2)) { // Celsius x Fahrenheit
            double temperatura = ((temperaturaOrigem * 1.8) + 32);

            System.out.println(temperatura);
        } else if ((unidadeOrigem == 2) && (unidadeDestino == 1)) { // Fahrenheit x Celsius
            double temperatura = ((temperaturaOrigem - 32) * (5.0 / 9.0));

            System.out.println(temperatura);
        }
    }
}