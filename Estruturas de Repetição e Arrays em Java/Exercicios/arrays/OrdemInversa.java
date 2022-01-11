package arrays;

/**
 * Exercício proposto na aula 3 do Estruturas de Repetição e Arrays em Java
 * - Faça um programa que crie um vetor de 6 números inteiros
 *   e mostre-os na ordem inversa.
 */

public class OrdemInversa {
    public static void main(String[] args) {
        int[] vetor = {1,2,3,4,5,6};

        for (int i = vetor.length-1; i>=0; i--){
            System.out.println("vetor[" + i + "] = " + vetor[i]);
        }
    }
}
