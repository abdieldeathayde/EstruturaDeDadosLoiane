package com.loiane.estruturadados.vetor.desafiosChatGpt;

import java.util.Scanner;

public class NumeroPrimo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero = sc.nextInt();

        if (numero == 2) {
            System.out.println("Número: " + numero + " é primo.");
        }
        else if (numero % 2 != 0) {
            System.out.println("Número: " + numero + " é primo.");
        } else {
            System.out.println("Número: " + numero + " é mão é primo.");
        }


    }
}
