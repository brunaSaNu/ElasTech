package Atividade3LacoDeRepeticao;

import java.util.ArrayList;
import java.util.Scanner;

public class Atividade10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> listaDeCompras = new ArrayList<>();
        boolean sair = false;

        while (!sair) {
            System.out.println("Digite o item que deseja adicionar à lista de compras:");
            String item = scanner.nextLine();
            listaDeCompras.add(item);

            System.out.println("Lista de compras atualizada:");
            for (String listItem : listaDeCompras) {
                System.out.println("- " + listItem);
            }

            System.out.println("Deseja adicionar mais itens? (s/n)");
            String resposta = scanner.nextLine();
            if (!resposta.equalsIgnoreCase("s")) {
                sair = true;
            }
        }

        System.out.println("Saindo... Lista de compras final:");
        for (String listItem : listaDeCompras) {
            System.out.println("- " + listItem);
        }

        scanner.close();
    }
}
