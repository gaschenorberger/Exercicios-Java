/*
    O objetivo principal desse script é o usuário utilizar para listar suas tarefas diárias.
    O script roda um loop pedindo para entrar com a tarefa e após pede se deseja inserir
    mais tarefas ou não.
    Caso o usuário não queira mais inserir tarefas ele para o loop.
    Após isso entra em outro loop, para listar todas as tarefas digitadas pelo usuário.
*/


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EX3 {
    public static void main(String[] args) {

        System.out.println("Seja bem vindo(a) a sua lista de tarefas diárias!");

        Scanner sc = new Scanner(System.in);
        List<String> listaTarefas = new ArrayList<>(); // Criando lista


        // While - Enquanto o usuário quiser inserir mais tarefas o loop nao para
        // Enquanto condicaoParada for diferente de 1

        int condicaoParada = 0;
        while (condicaoParada != 1){
            System.out.print("Insira sua tarefa: ");
            String tarefa = sc.nextLine();

            listaTarefas.add(tarefa); // Adicionando tarefa na lista

            System.out.println("Deseja inserir mais tarefas? ('0' para sim e '1' para não)");
            condicaoParada = sc.nextInt();
            sc.nextLine(); // Pra não bugar o nextLine ali de cima a partir da segunda execução

            if (condicaoParada==1){
                System.out.println("Encerrando Processo!");
            }
        }

        // Percorrendo tarefas

        System.out.println("\nTODAS AS SUAS TAREFAS:");

        int i = 1;
        for (String tarefa : listaTarefas){
            System.out.println(i + "- " + tarefa);
            i++;
        }
    }
}
