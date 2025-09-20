import java.util.Scanner;

public class EX5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o valor inicial do investimento (P)?");
        float p = sc.nextFloat();

        System.out.println("Qual a taxa de juros anual em porcentagem (ex: 5 para 5%)?");
        float r = sc.nextFloat();

        System.out.println("Quantas vezes por ano os juros serão calculados? (ex: 12 para mensal, 1 para anual)");
        float n = sc.nextFloat();

        System.out.println("Durante quantos anos o dinheiro ficará investido?");
        float t = sc.nextFloat();

        double taxaDecimal = r / 100.0;
        double montante = p * Math.pow((1 + taxaDecimal/n), (n*t));


        System.out.println("MONTANTE: " + montante);



    }
}
