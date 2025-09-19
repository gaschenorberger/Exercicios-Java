/*
    O objetivo principal desse script é a simulação de orçamento pessoal do usuário.
    O usuário vai entrar com suas receitas e despesas, nesse processo o script fica em loop
    para cada uma dessas.
    Durante esse processo, o script vai retornando no terminal o SALDO ATUAL para ir
    acompanhando a situação.
    Por fim, ele nos traz o saldo final com uma mensagem em baixo nos dizendo se nosso
    saldo está negativo ou positivo.
 */


import java.util.Scanner;

public class EX4 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com suas receitas: ");


        // While_1 - loop para entradas de receitas

        int condicaoParada = 0;
        float somaReceitas = 0;
        while (condicaoParada != 1){
            System.out.print("Receita (apenas numero): ");
            float receita = sc.nextFloat();

            somaReceitas = somaReceitas + receita; // Somando todas as receitas
            System.out.printf("SALDO ATUAL: %.2f\n\n", somaReceitas);


            System.out.println("Deseja inserir mais Receitas? ('0' para sim e '1' para não)");
            condicaoParada = sc.nextInt();
            sc.nextLine(); // Pra não bugar o nextLine ali de cima a partir da segunda execução

            if (condicaoParada==1){
                System.out.println("Encerrando Receitas!");
            }
        }


        // While_2 - loop para entradas de despesas

        System.out.println("\nEntre com suas despesas: ");

        condicaoParada = 0;
        float somaDespesas = 0;
        float saldoAtual = 0;
        while (condicaoParada != 1){
            System.out.print("Despesa (apenas numero): ");
            float despesa = sc.nextFloat();

            somaDespesas = somaDespesas + despesa; // Somando todas as Despesas

            saldoAtual = somaReceitas - somaDespesas; // Aqui diminui do saldo atual
            System.out.printf("SALDO ATUAL: %.2f\n\n", saldoAtual);


            System.out.println("Deseja inserir mais Despesas? ('0' para sim e '1' para não)");
            condicaoParada = sc.nextInt();
            sc.nextLine(); // Pra não bugar o nextLine ali de cima a partir da segunda execução

            if (condicaoParada==1){
                System.out.println("Encerrando Receitas!");
            }
        }

        System.out.printf("\nSEU SALDO É: %.2f\n", saldoAtual);

        if (saldoAtual < 0){
            System.out.println("SEU SALDO ESTA NEGATIVO!");
        }
        else {
            System.out.println("SEU SALDO ESTA POSITIVO!");
        }

    }
}
