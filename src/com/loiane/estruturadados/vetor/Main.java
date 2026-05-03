package com.loiane.estruturadados.vetor;

import java.util.ArrayList;
import java.util.Scanner;

import static com.loiane.estruturadados.vetor.desafiosChatGpt.Fibonacci.calculaFibonacci;

public class Main {

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

        System.out.print("Digite um valor: ");
        int valor = sc.nextInt();

        calculaFibonacci(valor);



        int numeroEhPrimo = sc.nextInt();

        if (numeroEhPrimo == 2) {
            System.out.println("Número: " + numeroEhPrimo + " é primo.");
        }
        else if (numeroEhPrimo % 2 != 0) {
            System.out.println("Número: " + numeroEhPrimo + " é primo.");
        } else {
            System.out.println("Número: " + numeroEhPrimo + " é mão é primo.");
        }

    }

}
