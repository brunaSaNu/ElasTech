package Atividade3LacoDeRepeticao;
import java.util.Scanner;
public class Atividade7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean sair = false;

        while (!sair) {
            System.out.println("Escolha uma operação:");
            System.out.println("1. Soma");
            System.out.println("2. Subtração");
            System.out.println("3. Multiplicação");
            System.out.println("4. Divisão");
            System.out.println("5. Sair");

            int escolha = scanner.nextInt();
            double num1, num2, resultado;

            switch (escolha) {
                case 1:
                    System.out.println("Digite o primeiro número:");
                    num1 = scanner.nextDouble();
                    System.out.println("Digite o segundo número:");
                    num2 = scanner.nextDouble();
                    resultado = num1 + num2;
                    System.out.println("O resultado da soma é: " + resultado);
                    break;
                case 2:
                    System.out.println("Digite o primeiro número:");
                    num1 = scanner.nextDouble();
                    System.out.println("Digite o segundo número:");
                    num2 = scanner.nextDouble();
                    resultado = num1 - num2;
                    System.out.println("O resultado da subtração é: " + resultado);
                    break;
                case 3:
                    System.out.println("Digite o primeiro número:");
                    num1 = scanner.nextDouble();
                    System.out.println("Digite o segundo número:");
                    num2 = scanner.nextDouble();
                    resultado = num1 * num2;
                    System.out.println("O resultado da multiplicação é: " + resultado);
                    break;
                case 4:
                    System.out.println("Digite o primeiro número:");
                    num1 = scanner.nextDouble();
                    System.out.println("Digite o segundo número:");
                    num2 = scanner.nextDouble();
                    if (num2 != 0) {
                        resultado = num1 / num2;
                        System.out.println("O resultado da divisão é: " + resultado);
                    } else {
                        System.out.println("Não é possível dividir por zero.");
                    }
                    break;
                case 5:
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

