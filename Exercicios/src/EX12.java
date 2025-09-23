/*
    O objetivo desse script é o usuário entrar com as informações: Temperatura, Clima, Estação do Ano.
    Com base nisso foram utilizadas condicionais para a temperatura, para dizer se o clima está quente,
    agrádavel, fresco ou frio. Em cada uma delas tem uma sugestão de roupa para ser utilizado esse dia.
    Logo abaixo, foi feito um switch para as estações do ano, e com base nelas foi feito apenas uma frase
    de consideração final
*/

import java.util.Scanner;

public class EX12 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Qual é a temperatura atual?");
        int temperatura = sc.nextInt();

        System.out.println("Está sol ou chovendo? ('0' para sol ou '1' para chovendo");
        int clima = sc.nextInt();

        System.out.println("Qual estação do ano está? ('0' para verão, '1' para outono, '2' para inverno ou '3' para primavera");
        int estacaoAno = sc.nextInt();


        if (temperatura > 25) { // Condicional simples
            System.out.println("CLIMA QUENTE!");
            System.out.println("Sugestão de roupas: Camiseta regata, shorts, bermuda, saia, vestido leve, sandálias, chinelos");
        }
        else if (temperatura >=18 && temperatura <=25){
            System.out.println("CLIMA AGRADÁVEL!");
            System.out.println("Sugestão de roupas: Camiseta de manga curta, calça jeans, calça de sarja, sapatênis");
        }
        else if (temperatura >=12 && temperatura <=17){
            System.out.println("CLIMA FRESCO!");
            System.out.println("Sugestão de roupas: Camisa de manga longa, suéter ou moletom por cima, jaqueta leve, calça comprida, sapatos fechados");
        }
        else {
            System.out.println("CLIMA FRIO!");
            System.out.println("Sugestão de roupas: Casaco pesado, jaqueta de couro forrada, blusa de lã, cachecol, gorro, luvas, botas");
        }


        switch (estacaoAno) { // Switch para cada estação do ano
            case 0: // Caso verão
                System.out.println("Não se esqueça do boné!");
                break;
            case 1: // Caso outono
                System.out.println("É sempre bom andar com um guarda-chuva!");
                break;
            case 2: // Caso inverno
                System.out.println("E não esqueça de por a toca!");
                break;
            case 3: // Caso primavera
                System.out.println("É sempre bom andar com um guarda-chuva!");
                break;
            default:
                System.out.println("Voce digitou o numero da estação errado!");
                break;
        }

        if (clima == 0){ // Condicional para tipo de clima
            System.out.println("\nEstá sol, passe protetor solar!");
        }
        else if (clima == 1){
            System.out.println("\nEstá chovendo, pegue um guarda-chuva!");
        }
    }
}
