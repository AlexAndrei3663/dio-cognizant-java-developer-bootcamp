package loop;

import java.util.Scanner;

/**
 * Exercício proposto na aula 2 do Estruturas de Repetição e Arrays em Java
 * - Faça um programa que leia 5 números, informe o maior valor e
 *   a média desses números
 */

public class MaiorEMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;
        int maior = 0;
        int media = 0;

        for(int i=0; i<5; i++){
            System.out.println("Informe um número: ");
            num = scan.nextInt();
            media += num;
            if (num > maior || i == 0)
                maior = num;
        }
        media /= 5;

        System.out.println("O maior valor digitado é " + maior);
        System.out.println("A média dos valores digitados é " + media);
    }
}
