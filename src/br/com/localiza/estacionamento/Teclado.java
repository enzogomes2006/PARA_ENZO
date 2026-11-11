package br.com.localiza.estacionamento;

import java.util.Scanner;

public class Teclado {
    private static final Scanner ENTRADA = new Scanner(System.in);

    public static int lerInteiro(String rotulo) {
        while (true) {
            try {
                return Integer.parseInt(lerString(rotulo).trim());
            } catch (NumberFormatException e) {
                System.out.println("Digite um numero inteiro valido.");
            }
        }
    }

    public static double lerDouble(String rotulo) {
        while (true) {
            try {
                return Double.parseDouble(lerString(rotulo).trim().replace(',', '.'));
            } catch (NumberFormatException e) {
                System.out.println("Digite um numero valido.");
            }
        }
    }

    public static String lerString(String rotulo) {
        System.out.println(rotulo);
        return ENTRADA.nextLine();
    }
}
