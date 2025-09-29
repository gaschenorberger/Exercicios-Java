/*
    O objetivo principal desse script é o usuário entrar com o valor da compra e
    após isso o sistema calcula com base no valor a porcentagem de desconto.
    Caso o valor for maior que 100 e menor que 500 será 10%, caso o valor for
    maior que 500 o desconto será de 20%.
 */


import java.util.Scanner;

public class EX7 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Qual foi o valor da compra?");
        float vlCompra = sc.nextFloat();

        if (vlCompra > 100 && vlCompra < 500){
            double vlDescontado = vlCompra * 0.90; // valor da compra x 10% (0.90)

            System.out.println("Seu valor com desconto fica: R$" + vlDescontado);
        }
        else if (vlCompra > 500){
            double vlDescontado = vlCompra * 0.80; // valor da compra x 20% (0.80)

            System.out.println("Seu valor com desconto fica: R$" + vlDescontado);
        }
    }
}
