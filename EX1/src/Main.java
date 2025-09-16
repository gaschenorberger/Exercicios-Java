/*
A ideia principal desse script é o usuário entrar com seu peso e altura, com base nisso,
o programa vai retonar seu IMC, se voce está com PESO NORMAL, SOBREPESO, OBESIDADE, OBESIDADE GRAVE
ou MAGREZA.
*/


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com o seu peso: ");
        float peso = sc.nextFloat();

        System.out.println("Entre com o sua altura: ");
        float altura = sc.nextFloat();

        double resultado = peso / (altura*altura);
        System.out.println(resultado);


        if ((resultado >=18.5) && (resultado <= 24.9)){
            System.out.println("PESO NORMAL");
        }
        else if ((resultado >=25) && (resultado <= 29.9)){
            System.out.println("SOBREPESO");
        }
        else if ((resultado >=30) && (resultado <= 39.9)){
            System.out.println("OBESIDADE");
        }
        else if (resultado >=40){
            System.out.println("OBESIDADE GRAVE");
        }
        else {
            System.out.println("MAGREZA");
        }
    }
}