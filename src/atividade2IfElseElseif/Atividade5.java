package atividade2IfElseElseif;

import java.util.Scanner;

public class Atividade5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número intero");
        int numero = sc.nextInt();

        int positivo = 0;
        int negativo = 0;
        int absoluto = 0;

        if (numero >= 0){
            positivo = numero;
            System.out.println("O número " + positivo + " é positivo");
        }
        else if (numero < 0) {
            negativo = numero;
            absoluto = Math.abs(numero);
            System.out.println("O número " + negativo + " é negativo, e seu valor absoluto é: " + absoluto);
        }

        sc.close();
    }
}
