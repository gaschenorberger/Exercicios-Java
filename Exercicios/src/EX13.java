/*
    O objetivo principal desse Script é fazer a tabuada do 1 ao 10.
    No início tem uma pergunta para o usuário de qual o limite que ele quer.
    Esse limite vai ser refletido para todas as tabuadas, se o usuário escolheu
    limite 50, a hora que passar do 50 ele vai dar um break para parar aquela tabuada.
 */

import java.util.Scanner;

public class EX13 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Qual limite da tabuada você quer? Ex: 50");
        int limite = sc.nextInt();

        for (int numeroTabuada=1; numeroTabuada<=10; numeroTabuada++){
            System.out.println("INICIANDO TABUADA DO " + numeroTabuada);

            int i = 1;
            while (i <= 10){

                int tabuada = numeroTabuada * i;

                if (tabuada > limite) {
                    System.out.println("Resultado " + tabuada + " ultrapassou o limite!");
                    break;
                }
                else {
                    System.out.println(numeroTabuada + " * " + i + " = " + tabuada);
                }

                i++;


            }
            System.out.println("\n\n");
        }
    }
}
