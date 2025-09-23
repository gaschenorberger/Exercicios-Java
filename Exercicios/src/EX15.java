/*
    O objetivo principal desse Script é ter um contador de votos em eleição.
    Nesse script tem apenas 2 candidados e a opção nulo. O usuario escolhe em quem
    votar através de numero. Os candidatos são salvos através de um vetor,
    candidato 1 = posição 0, candidato 2 = posição 1 e nulo posição 3.
    Após cada voto, entra um loop para achar a condição: voto for = i + 1.
    Então vendo de outra maneira, na primeira execução do for, se '1' (voto) for igual a 0 (i) + 1
    ele acrescenta um ++ na posição do candidato como voto.
    Por fim, para sair o usuário deve digitar 'fim' quando pede se deseja sair.
 */

import java.util.Scanner;

public class EX15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Vetor para armazenar votos (0 = candidato 1 | 1 = candidato 2 | 2 = nulo)
        int[] votos = new int[3];

        while (true) {
            System.out.println("Digite seu voto (1- candidato | 2- candidato2 | 3- nulo)");
            int voto = sc.nextInt();

            for (int i = 0; i < votos.length; i++) {
                if (voto == i + 1) { // se o voto for igual a i + 1 ele incrementa através da posição do candidato
                    votos[i]++;
                    break;
                }
            }

            System.out.println("Deseja continuar? Se sim digite 'sim', se não digite 'fim'");
            sc.nextLine();
            String saida = sc.nextLine();

            // equalsIgnoreCase tem como finalidade: se entrada for igual ignorando letras maiusculas ou minusculas
            if (saida.equalsIgnoreCase("fim")) {
                break;
            }
        }

        // resultado
        System.out.println("\nResultado da eleição:");
        for (int i = 0; i < votos.length; i++) {
            if (i==2){
                System.out.println("Nulo: " + votos[i] + " votos");
            }
            else{
                System.out.println("Candidato " + (i + 1) + ": " + votos[i] + " votos");
            }
        }
    }
}
