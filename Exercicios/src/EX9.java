/*
    O objetivo principal desse script é o usuário entrar com a nota do aluno
    e após isso fazer uma verficação com essa nota se o aluno esta aprovado,
    esta de recuperação ou está reprovado.
    Também no final do sistema, retorna o conceito do aluno (A,B,C)
 */

import java.util.Scanner;

public class EX9 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a note do aluno: (0-10)");
        float notaAluno = sc.nextFloat();


        // Verificação para ver se a nota digitada esta entre 0 e 10
        if (notaAluno > 10 || notaAluno < 0){
            System.out.println("DIGITE UMA NOTA ENTRE 0 E 10!");
        }
        else { // Condicional simples para definir status do aluno
            if (notaAluno >= 7.0){
                System.out.println("APROVADO");
            }
            else if (notaAluno >= 4.0 && notaAluno < 7.0) {
                System.out.println("RECUPERAÇÃO");
            }
            else {
                System.out.println("REPROVADO");
            }

            // Mudança de tipo
            // Casting de variavel para nao bugar o switch
            int nota = (int) notaAluno;

            String conceito = "A";
            switch (nota){
                case 10:
                case 9:
                case 8:
                    conceito = "A";
                    break;
                case 7:
                case 6:
                    conceito = "B";
                    break;
                default:
                    conceito = "C";
            }

            System.out.println("O conceito do aluno é: " + conceito);
        }
    }
}
