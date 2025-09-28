/*
    O objetivo desse script é simular o gerenciamento básico de estoque usando array de inteiros para representar
    as quantidades de diferentes produtos.
    Foi utlizado o método sort para ordenar nossa lista do menor par ao maior.
    A quantidade minima é definida através do primeiro item da lista, porque o sort é feito no começo do script,
    então o menor numero vai estar na primeira posição. Por fim ele retorna tudo com print.
 */

import java.util.Arrays;

public class EX21 {
    public static void main(String[] args){
        int[] quantidade = {15, 30, 5, 22, 10};
        Arrays.sort(quantidade);

        int totalEstoque = 0;
        int quantMinima = quantidade[0];

        for (int numero : quantidade){
            totalEstoque = totalEstoque + numero;
        }

        System.out.println("QUANTIDADES DE PRODUTOS TOTAL: " + totalEstoque);
        System.out.println("QUANTIDADE MÍNIMO: " + quantMinima);
        System.out.println("LISTA ORDENADA COM SORT: " + Arrays.toString(quantidade)); // Arrays toString para retornar de maneira certa a lista
    }
}
