package com.loiane.estruturadados.vetor.desafiosChatGpt;

import java.util.ArrayList;
import java.util.Scanner;

public class Array {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> numeros = new ArrayList<>();

        int numero;

        int menor = Integer.MAX_VALUE;
        int maior = Integer.MIN_VALUE;

        System.out.println("Digite números (0 para sair):");

        while (true) {
            numero = sc.nextInt();

            if (numero == 0) {
                break; // encerra o programa
            }

            numeros.add(numero);

            if (numero < menor) {
                menor = numero;
            }

            if (numero > maior) {
                maior = numero;
            }

            System.out.println("Maior até agora: " + maior);
            System.out.println("Menor até agora: " + menor);
        }

        System.out.println("\nPrograma encerrado.");
        System.out.println("Lista de números: " + numeros);

        sc.close();
    }
}