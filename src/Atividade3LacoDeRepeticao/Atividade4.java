package Atividade3LacoDeRepeticao;

import java.util.Scanner;

public class Atividade4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número para verificar se é primo ou não: ");
        int primo = sc.nextInt();

        if (primo % 2 !=0 && primo % 3 !=0 && primo % 5 != 0 || primo == 2 || primo == 5 || primo == 3 && primo !=1){
            System.out.println("Este é um número primo!");
        } else {
            System.out.println("Este não é um número primo");
        }
        sc.close();
    }
}
