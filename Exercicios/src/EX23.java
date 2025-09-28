/*
    O objetivo desse script é criar um simulador de fila de atendimento.
    Com base nisso, foi feito iniciado uma lista, e após isso adicionado manualmente o nome dos clientes.
    Ai mostra a lista e logo depois o primeiro ja é atendido, entao diminiu 1 na lista.
 */

import java.util.ArrayList;
import java.util.List;

public class EX23 {
    public static void main(String[] args){
        List<String> filaAtendimento = new ArrayList<>();

        System.out.println("ENTRADA DE CLIENTES NA FILA");

        filaAtendimento.add("Carlos");
        System.out.println("Novo Cliente: Carlos");

        filaAtendimento.add("Alice");
        System.out.println("Novo Cliente: Alice");

        filaAtendimento.add("Bruno");
        System.out.println("Novo Cliente: Bruno");

        filaAtendimento.add("Diana");
        System.out.println("Novo Cliente: Diana");

        int i = 1;
        System.out.println("\nFILA");
        for (String nome : filaAtendimento){
            System.out.println(i + " - " + nome);
            i++;
        }

        String clienteAtendido = filaAtendimento.remove(0);
        System.out.println("\nCLIENTE ATENDIDO: " + clienteAtendido);

        System.out.println("\nNOVA FILA");

        i = 1;
        System.out.println("\nFILA");
        for (String nome : filaAtendimento){
            System.out.println(i + " - " + nome);
            i++;
        }
    }
}
