/*
    O objetivo desse script é criar um processador de dados climáticos.
    Ele calcula a temperatura média de um periodo, calcula o quanto cada temperatura se desviou da média
 */

import java.util.Arrays;

public class EX24 {
    public static void main(String[] args){
        double[] temperaturas = {22.5, 25.0, 21.5, 23.0};

        double somaTemperaturas = 0;

        for (double temp : temperaturas){
            somaTemperaturas = somaTemperaturas + temp; // Somando todas as temperaturas
        }

        double media = somaTemperaturas / temperaturas.length; // Criando a média

        double[] desvios = new double[temperaturas.length]; // Criando lista para armazenar os desvios

        for (int i = 0; i<temperaturas.length; i++){
            double temperaturaAtual = temperaturas[i];
            double desvioCalculado = temperaturaAtual - media;

            desvios[i] = desvioCalculado; // Atribuindo a lista de desvios
        }

        System.out.println("MÉDIA DAS TEMPERATURAS: " + media);
        System.out.println("DESVIOS EM RELAÇÃO À MÉDIA: ");
        System.out.println(Arrays.toString(desvios));
    }
}
