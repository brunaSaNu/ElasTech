package atividade2IfElseElseif;

import java.util.Scanner;

public class Atividade6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor de sua compra para receber seu desconto: ");
        double compra = sc.nextDouble();

        double desconto200 = 0.0;
        double desconto100 = 0.0;

        System.out.println("Selecione o método de pagamento: ");
        System.out.println("Digite 1 para Cartão de Crédito");
        System.out.println("Digite 2 para Boleto Bancário");
        int pagamento = sc.nextInt();

        if (compra > 200.00){
            desconto200 = compra - (compra * 0.10);
            System.out.println("Você recebeu um desconto de 10%!");
            System.out.println("O valor de sua compra é de: " + desconto200);
        }
        else if (compra >= 100.00 || compra <= 200.00) {
            desconto100 = compra - (compra * 0.05);
            System.out.println("Você recebeu um desconto de 5%!");
            System.out.println("O valor de sua compra é de: " + desconto100);
        }

        switch (pagamento){
            case 1:
                System.out.println("Seu pagamento será realizado por: Cartão de crédito");
                break;
            case 2:
                System.out.println("Seu pagamento será realizado por: Boleto Bancário");
                break;
        }
        sc.close();
    }
}
