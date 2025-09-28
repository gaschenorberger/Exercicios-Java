/*
    O objetivo desse script é criar um gerador de senhas aleatórias.
    Foram utilizadas listas para armazenar simbolos e uma lista para armazenar a senha. As letras foram feitas atráves
    de uma variável normal mesmo, e números gerados com random. No metodo principal é chamado a função geradorSenha,
    pode ser passado como parâmetro o tamanho da senha necessaria, com base nesse tamanho, é criado um for.
    Nesse for é o seguinte, se o tamanho é 8 entao o for vai rodar 8 vezes, 1 por um. Dentro do for foi feito um random
    de 0 a 2, caso for 0, atribui na lista de senha uma letra, caso 1, atribui numero e caso 3 um simbolo. Por fim
    ele só da um print para mostrar a senha final.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class EX20 {

    public static void geradorSenha(int tamanho){

        Random random = new Random();

        String letras = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ"; // Definindo todas as letras possiveis

        // Lista contendo simbolos para utilizar na senha
        List<String> simbolos = List.of("!", "@", "#", "$", "%", "&", "*", "(", ")", "-", "+", "=", "[", "]", "{", "}", "|", "\\", ";", ":", "'", "\"", "<", ">", ",", ".", "/", "?", "`", "~");

        // Criando lista para armazenar a senha
        List<String> senha = new ArrayList<>();

        for (int i=0; i<tamanho; i++){

            int charAleatorio = random.nextInt(3); // Random para escolher de forma aleatória se o char vai ser um numero, letra ou simbolo

            switch (charAleatorio) {
                case 0: // Caso 0 vai retornar uma letra
                    int indiceLetra = random.nextInt(letras.length());
                    char letraSorteada = letras.charAt(indiceLetra); // charAt retorna o valor no indice especifico -- apenas CHAR

//                    System.out.println(letraSorteada);

                    senha.add(String.valueOf(letraSorteada)); // String.valueOf é para transformar char em String

                    break;
                case 1: // Caso 1 vai retornar um numero de 0 a 9
                    int numeros = random.nextInt(10);
//                    System.out.println(numeros);

                    senha.add(String.valueOf(numeros));

                    break;
                case 2:
                    int indiceAleatorio = random.nextInt(simbolos.size());
                    String simboloAleatorio = simbolos.get(indiceAleatorio); // get retorna o valor que ta no indice especifico da lista STRING

//                    System.out.println(simboloAleatorio);

                    senha.add(String.valueOf(simboloAleatorio));

                    break;

            }
        }

        System.out.println("SENHA ALEATÓRIA GERADA: ");
        for (String caracter : senha){ // For simples pra mostrar a senha
            System.out.print(caracter);
        }
    }

    public static void main(String[] args){

        geradorSenha(8); // Chamando a função no método principal

    }
}
