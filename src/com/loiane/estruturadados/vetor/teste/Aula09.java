package com.loiane.estruturadados.vetor.teste;

import com.loiane.estruturadados.vetor.Vetor;

public class Aula09 {

    static void main() {
        Vetor vetor = new Vetor(3);

        vetor.adiciona("B");
        vetor.adiciona("G");
        vetor.adiciona("D");
        vetor.adiciona("E");
        vetor.adiciona("F");

        System.out.println(vetor);

        vetor.remove(1);
        System.out.println(vetor);

        System.out.println("Remover o elemento E");

        int posicao = vetor.busca("A");
        if (posicao > -1) {
            vetor.remove(posicao);
        } else {
            System.out.println("Elemento não existe no vetor");
        }

        System.out.println(vetor);
    }

}
