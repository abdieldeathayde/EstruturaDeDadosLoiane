package com.loiane.estruturadados.vetor.desafiosChatGpt;

import java.math.BigInteger;
import java.util.Scanner;

public class Fatorial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero = sc.nextInt();

        System.out.println(calculaFatorial(numero));

    }

    public static BigInteger calculaFatorial(int numero) {
        BigInteger fatorial = BigInteger.ONE;

        for (int i = 2; i < numero; i++) {
            fatorial = BigInteger.valueOf((long) numero * numero - (i));
            System.out.println("O fatorial é: " + fatorial);
        }

        return fatorial;
    }

}
