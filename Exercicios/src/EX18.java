/*
    O objetivo desse script é fazer um validador de CPF, um cpf não é um número aleatório gerado, tem uma série
    de regras por trás dele, todo um cálculo pra ver se ele é válido ou não.
    Ele passa por uma validação de tamanho, limpa, tira traços e pontos. Um cpf nao pode ter os digitos todos iguais.
    Ai para a validação tem que calular 2 dígitos verificadores. 1 : Multiplica cada um dos 9 dígitos por pesos que vão de 10 até 2.
    Soma todos os resultados, calcula o resto da divisão da soma por 11, se o resto for menor que 2, o dígito é 0,
    caso contrário, o dígito é 11 - resto. 2 : Agora usa os 9 dígitos + o 1º dígito calculado, multiplica cada um por pesos de 11 até 2
    e depois aplica as mesmas regras.
 */


import java.util.Scanner;

public class EX18 {

    public static boolean cpfValido(String cpf) {

        String cpfLimpo = cpf.replaceAll("[^0-9]", ""); // Removendo traços e pontos

        if (cpfLimpo.length() != 11) { // Verificando se tem menos ou mais que 11 digitos
            return false;
        }

        if (cpfLimpo.matches("(\\d)\\1{10}")) { // verificando digitos todos repetidos
            return false;
        }

        int[] digitos = new int[11]; // Criando uma lista para salvar cada digito para fazer o cálculo
        for (int i = 0; i < 11; i++) {
            digitos[i] = Character.getNumericValue(cpfLimpo.charAt(i));
        }


        int soma = 0;
        int peso = 10; // o peso vai de 10 a 2, porque pega os 9 digitos do cpf
        for (int i = 0; i < 9; i++) { // Aqui vai ser feito a soma dos 9 digitos pra ver o Digito Verificador 1
            soma += digitos[i] * peso--;
        }

        int dv1Calculado = 11 - (soma % 11); // aqui obtém o resto da soma dividido por 11, menos 11
        if (dv1Calculado > 9) { // se o digito calculado for maior que 9 entao o digito verificador 1 vai ser 0
            dv1Calculado = 0;
        }

        if (digitos[9] != dv1Calculado) { // aqui ele ve se o 10 digito do cpf nao bate com o digito verificador 1
            return false;
        }

        soma = 0;
        peso = 11; // Agora vai ser calculado o digito verificador 2, peso 11 porque adiciona +1 q é o 10 digito
        for (int i = 0; i < 10; i++) { // agora o peso vai ser de 11 a 2
            soma += digitos[i] * peso--;
        }

        int dv2Calculado = 11 - (soma % 11);
        if (dv2Calculado > 9) {
            dv2Calculado = 0;
        }

        // Verifica se o segundo digito verificador ta batendo
        return digitos[10] == dv2Calculado;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu CPF: ");
        String cpf = sc.nextLine();

        if (!cpfValido(cpf)){
            System.out.println("O CPF: " + cpf + " é INVALIDO");
        }
        else {
            System.out.println("O CPF: " + cpf + " é VÁLIDO");
        }


    }
}