package Atividade3LacoDeRepeticao;

import java.util.Scanner;

public class Atividade2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número para verificar o resultado de sua tabuada: ");
        int numero = sc.nextInt();
        int tabuada = 0;

        for (int i = 0; i <= 10; i++){
            tabuada = numero * i;
            System.out.println(numero + " * " + i + " = " + tabuada);
        }

        sc.close();
    }
}
