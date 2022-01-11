package arrays;

import java.util.Random;

/**
 * Exercício proposto na aula 3 do Estruturas de Repetição e Arrays em Java
 * - Faça um programa que gere uma matriz M 4x4 com valores aleatórios entre 0 e 9.
 */
public class ArrayMultidimensional {
    public static void main(String[] args) {
        Random random = new Random();

        int[][] matriz = new int[4][4];

        for(int n=0; n<matriz.length; n++){
            for(int m=0; m<matriz[n].length; m++){
                matriz[n][m] = random.nextInt(10);
            }
        }

        System.out.println("Matriz [4][4]:");
        for( int[] array : matriz){
            System.out.print("|");
            for( int elemento : array ){
                System.out.print(" " + elemento + " ");
            }
            System.out.println("|");
        }
    }
}
