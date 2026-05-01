package com.loiane.estruturadados.vetor.desafiosChatGpt;

import java.util.ArrayList;
import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        int valor = sc.nextInt();

        calculaFibonacci(valor);
    }

    public static void calculaFibonacci(int numero) {
        ArrayList<Integer> lista = new ArrayList<>();

        if (numero <= 0) {
            System.out.println("Valor inválido!");
            return;
        }

        // Valores iniciais
        lista.add(0);

        if (numero > 1) {
            lista.add(1);
        }

        // Construção da sequência
        for (int i = 2; i < numero; i++) {
            int ultimo = lista.get(lista.size() - 1);
            int penultimo = lista.get(lista.size() - 2);

            int proximo = ultimo + penultimo;
            lista.add(proximo);
        }

        // Saída
        System.out.println(lista);
    }
}