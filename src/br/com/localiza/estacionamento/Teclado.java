package br.com.localiza.estacionamento;

import java.util.Scanner;

public class Teclado {

    private static Scanner entrada = new Scanner(System.in);

    public static String lerString(String mensagem) {
        String texto;
        do {
            System.out.print(mensagem);
            texto = entrada.nextLine().trim();
            if (texto.isEmpty()) {
                System.out.println("Digite um valor.");
            }
        } while (texto.isEmpty());
        return texto;
    }

    public static int lerInteiro(String mensagem) {
        while (true) {
            System.out.print(mensagem);
            try {
                return Integer.parseInt(entrada.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Digite um numero inteiro valido.");
            }
        }
    }
}
