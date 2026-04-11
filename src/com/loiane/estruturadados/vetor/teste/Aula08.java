package com.loiane.estruturadados.vetor.teste;


import com.loiane.estruturadados.vetor.Vetor;

public class Aula08 {

    static void main() {

        Vetor vetor = new Vetor(3);

        vetor.adiciona("B");
        vetor.adiciona("C");
        vetor.adiciona("E");
        vetor.adiciona("F");
        vetor.adiciona("G");

        System.out.println(vetor);
    }
}
