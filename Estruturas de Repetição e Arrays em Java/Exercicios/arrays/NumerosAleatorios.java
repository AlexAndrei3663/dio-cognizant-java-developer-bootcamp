package arrays;

import java.util.Random;

/**
 * Exercício proposto na aula 3 do Estruturas de Repetição e Arrays em Java
 * - Faça um programa que leia 20 numeros inteiros aleatorios (ente 0 e 100) e armazene-os em um vetor.
 * - Ao final, mostre os numeros e seus sucessores
 */
public class NumerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numAleatorios = new int[20];

        for (int i = 0; i<numAleatorios.length; i++) {
            numAleatorios[i] = random.nextInt(100);
        }

        int count = 1;
        for (int num : numAleatorios ) {
            System.out.println("numero " + count + ":" + num + ", proximo: " + (num+1));
            count++;
        }
    }
}
