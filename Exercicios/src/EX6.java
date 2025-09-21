/*
    O objetivo principal desse script é verificar se uma pessoa é apta para votar.
    A pessoa só estará apta a votar se tiver 16 ou mais anos e for brasileiro.
    E no final retorna uma mensagem dizendo se é apto ou não.
 */


import java.util.Scanner;

public class EX6 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Qual sua idade? (em numero ex: 16)");
        int idade = sc.nextInt();

        System.out.println("Voce é brasileiro? ('1' para sim ou '0' para não");
        int nacionalidadeInput = sc.nextInt();


        // Definindo se nacionalidade é verdadeira ou falsa, brasileiro ou não

        boolean nacionalidade = false;
        switch (nacionalidadeInput){
            case 0:
                nacionalidade = false;
                break;
            case 1:
                nacionalidade = true;
                break;
            default:
                System.out.println("Voce digitou um numero errado, recomece!");
                break;
        }

        // Condicional simples para dizer se está apto ou não

        if (nacionalidade && idade >=16){
            System.out.println("Voce esta apto para votar!");
        }
        else {
            System.out.println("Voce não esta apto a votar!");
        }

    }
}
