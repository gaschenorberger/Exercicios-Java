import java.util.Scanner;

public class EX17Caluladora {

    public int somar(int numero1, int numero2){
        int resultadoSoma = numero1 + numero2;
        return resultadoSoma;
    }

    public int subtrair(int numero1, int numero2){
        int resultadoSubtr = numero1 - numero2;
        return resultadoSubtr;
    }

    public int multiplicar(int numero1, int numero2){
        int resultadoMulti = numero1 * numero2;
        return resultadoMulti;
    }

    public double divisao(double numero1, double numero2){
        double resultadoDivi = numero1 * numero2;
        return resultadoDivi;
    }


    public static void main(String[] args){

        EX17Caluladora calculadora = new EX17Caluladora();
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com o numero 1: ");
        double numero1 = sc.nextDouble();

        System.out.println("Entre com o numero 2: ");
        double numero2 = sc.nextDouble();

        System.out.println("Escolha a operação: (1 - SOMAR | 2 - SUBTRAIR | 3- MULTIPLICAR | 4 - DIVIDIR");
        int operacao = sc.nextInt();

        switch (operacao) {

            case 1: // somar
                int soma = calculadora.somar((int)numero1, (int)numero2);
                System.out.printf("A soma de %d + %d é: %d", (int) numero1, (int) numero2, soma);

                break;
            case 2: // subtrair
                int subtrair = calculadora.subtrair((int)numero1, (int)numero2);
                System.out.printf("A subtração de %d - %d é: %d", (int) numero1, (int) numero2, subtrair);

                break;
            case 3: // multiplicar
                int multiplicar = calculadora.multiplicar((int) numero1, (int) numero2);
                System.out.printf("A multiplicação de %d * %d é: %d", (int) numero1, (int) numero2, multiplicar);

                break;
            case 4: // dividir
                double dividir = calculadora.divisao(numero1, numero2);
                System.out.printf("A divisão de  de %d / %d é: %d", (int) numero1, (int) numero2, dividir);

                break;
            default:
                System.out.println("VOCE DIGITOU A OPERAÇÃO ERRADA!");
        }



    }
}
