package Atividade3LacoDeRepeticao;

import java.util.Scanner;

public class Atividade9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean sair = false;

        while (!sair) {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Celsius para Fahrenheit");
            System.out.println("2. Fahrenheit para Celsius");
            System.out.println("3. Sair");

            int escolha = scanner.nextInt();
            double temperatura, resultado;

            switch (escolha) {
                case 1:
                    System.out.println("Digite a temperatura em Celsius:");
                    temperatura = scanner.nextDouble();
                    resultado = (temperatura * 9 / 5) + 32;
                    System.out.println("A temperatura em Fahrenheit é: " + resultado);
                    break;
                case 2:
                    System.out.println("Digite a temperatura em Fahrenheit:");
                    temperatura = scanner.nextDouble();
                    resultado = (temperatura - 32) * 5 / 9;
                    System.out.println("A temperatura em Celsius é: " + resultado);
                    break;
                case 3:
                    sair = true;
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
        scanner.close();
        
    }
}
