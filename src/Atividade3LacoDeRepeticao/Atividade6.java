package Atividade3LacoDeRepeticao;

import java.util.Scanner;

public class Atividade6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite números inteiros positivos: ");
        int inteiros = sc.nextInt();
        int contador = 0;
        int soma = 0;
        int media = 0;

        while (inteiros > 0){
            soma = soma + inteiros;
            contador++;

            inteiros = sc.nextInt();
        }

        if(contador > 0){
            media = soma / contador;
            System.out.println("Média dos números positivos: " + media);
        }

        sc.close();
    }
}
