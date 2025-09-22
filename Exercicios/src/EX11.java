/*
    O objetivo principal desse script é validar a força de uma senha com base em 3 requisitos.
    A senha deve ter 8 ou mais caracteres, ter uma letra maiuscula e um numero.
    Caso tiver os 3 requisitos OK, caso contrario o sistema irá retornar o que está faltando na senha
    e dar o nível que esta sua senha.
 */


import java.util.Scanner;

public class EX11 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("INSIRA SUA SENHA: (8 caracteres, pelo menos 1 número e uma letra maiúscula!)");
        String senha = sc.nextLine();

        int tamanhoSenha = senha.length();

        // Definindo variaveis booleanas para me retonar se os requisitos existem
        boolean maiuscula = false;
        boolean numero = false;
        boolean tamanho = false;

        for (int i = 0; i < tamanhoSenha; i++) { // Loop para percorrer cada caracter da senha

            char caracterAtual = senha.charAt(i); // chatAt: retorna o caracter baseado na posição passada
//            System.out.println(caracterAtual);

            if (tamanhoSenha >=8){
                tamanho = true;
            }

            if (Character.isUpperCase(caracterAtual)){ // Se caracter é uma letra maiuscula
                maiuscula = true;
            }

            if (Character.isDigit(caracterAtual)){ // Se caracter tem é um numero
                numero = true;
            }
        }

        // Caso o requisito existir, adiciona um ponto na força da senha
        int forcaSenha = 0;

        if (tamanho){
            forcaSenha++;
        }

        if (maiuscula){
            forcaSenha++;
        }

        if (numero){
            forcaSenha++;
        }


        // Switch para me retornar a força da senha, com base nos requisitos
        switch (forcaSenha){
            case 3:
                System.out.println("SENHA FORTE, ATENDE A TODOS OS REQUISITOS!");
                break;

            case 2:
                System.out.println("SENHA MÉDIA, SÓ ATENDE A DOIS REQUISITOS!");

                if (!(tamanhoSenha >=8)){ // if not
                    System.out.println("SUA SENHA NÃO TEM 8 CARACTERES");
                }

                if (!maiuscula){ // if not
                    System.out.println("SUA SENHA NAO TEM LETRA MAIUSCULA");
                }

                if (!numero){
                    System.out.println("SUA SENHA NÃO TEM NUMERO");
                }


                break;

            case 1:
                System.out.println("SENHA FRACA, SÓ ATENTE A UM DOS REQUISITOS!");

                if (!(tamanhoSenha >=8)){ // if not
                    System.out.println("SUA SENHA NÃO TEM 8 CARACTERES");
                }

                if (!maiuscula){ // if not
                    System.out.println("SUA SENHA NAO TEM LETRA MAIUSCULA");
                }

                if (!numero){
                    System.out.println("SUA SENHA NÃO TEM NUMERO");
                }

                break;


            default:
                System.out.println("SUA SENHA NAO ATENDE AOS REQUISITOS!");

                if (!(tamanhoSenha >=8)){ // if not
                    System.out.println("SUA SENHA NÃO TEM 8 CARACTERES");
                }

                if (!maiuscula){ // if not
                    System.out.println("SUA SENHA NAO TEM LETRA MAIUSCULA");
                }

                if (!numero){
                    System.out.println("SUA SENHA NÃO TEM NUMERO");
                }

                break;
        }
    }
}
