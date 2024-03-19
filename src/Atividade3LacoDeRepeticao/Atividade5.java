package Atividade3LacoDeRepeticao;

public class Atividade5 {
    public static void main(String[] args) {

        int n = 20;
        int a = 0, b = 1;

        System.out.println("Os primeiros 20 números da sequência de Fibonacci:");
        System.out.print(a + " " + b + " ");
        for (int i = 2; i < n; i++) {
            int soma = a + b;
            System.out.print(soma + " ");
            a = b;
            b = soma;
        }

    }
}
