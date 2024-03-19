package atividade2IfElseElseif;

import java.util.Scanner;

public class Atividade3 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = sc.nextInt();
        
        if (numero == 0){
            System.out.println("O número digitado é zero");
        } else if (numero % 2 == 0) {
            System.out.println("O numero digitado é positivo.");
        } else {
            System.out.println("O número digitado é negativo");
        }

        sc.close();
        
    }
}
