/*
    O objetivo do script é armazenar e processar um conjunto de notas de uma turma.
    O script deve retornar a média, a nota máxima e o total de alunos reprovados.
    Foi pré definidido as notas.
 */

public class EX22 {
    public static void main(String[] args){

        double[] notas = {7.5, 9.0, 4.5, 6.0, 8.5};

        double somaNota = 0;
        double notaMaxima = notas[0]; // Pegando primeira posição da lista
        int reprovados = 0;

        for (double notaAtual : notas){
            somaNota = somaNota + notaAtual;

            if (notaAtual > notaMaxima){
                notaMaxima = notaAtual;
            }

            if (notaAtual < 7.0){
                reprovados++;
            }
        }

        double media = somaNota / notas.length; // Definindo media turma

        System.out.println("A MÉDIA DA TURMA É: "+ media);
        System.out.println("A NOTA MAXIMA ENCONTRADA FOI: " + notaMaxima);
        System.out.println("TOTAL DE ALUNOS REPROVADOS: " + reprovados);
    }
}
