package atividade2IfElseElseif;

import java.util.Scanner;

public class Atividade2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int numero1 = sc.nextInt();

        System.out.println("Digite o segundo número inteiro: ");
        int numero2 = sc.nextInt();

        int soma = numero1 + numero2;
        int subtracao = numero1 - numero2;
        int multiplicacao = numero1 * numero2;
        int divisao = numero1 / numero2;

        System.out.println("A soma desses números é igual a: " + soma);
        System.out.println("A subtração desses númmeros é igual a: " + subtracao);
        System.out.println("A multiplicação desses números é igual a: " + multiplicacao);
        System.out.println("A divisão desses números é igual a: " + divisao);
        sc.close();
    }
}
