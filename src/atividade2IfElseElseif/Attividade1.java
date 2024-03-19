package atividade2IfElseElseif;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Attividade1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.println("Agora, digite sua idade: ");
        int idade = sc.nextInt();

        System.out.println("Seu nome é: " + nome + ", e sua idade é: " + idade + " anos.");

        sc.close();

    }
}
