/*
    O objetivo desse script é calcular o valor final de um investimento com juros compostos.
    O usuário irá entrar com todos os dados necessarios (Valor Principal, Taxa de Juros e
    o numero de vezes do juro.
    No final será retornado o montante final.
 */


import java.util.Scanner;

public class EX5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Obtenção de dados para cálculo do valor final

        System.out.println("Qual o valor inicial do investimento (P)?");
        float p = sc.nextFloat();

        System.out.println("Qual a taxa de juros anual em porcentagem (ex: 5 para 5%)?");
        float r = sc.nextFloat();

        System.out.println("Quantas vezes por ano os juros serão calculados? (ex: 12 para mensal, 1 para anual)");
        float n = sc.nextFloat();

        System.out.println("Durante quantos anos o dinheiro ficará investido?");
        float t = sc.nextFloat();

        // Cálculo valor final

        double taxaDecimal = r / 100.0; // Transformando a taxa em %
        double montante = p * Math.pow((1 + taxaDecimal/n), (n*t));


        System.out.println("O SEU MONTANTE FINAL É: " + montante);



    }
}
