package loop;

import java.util.Scanner;

/**
 * Exercício proposto na aula 2 do Estruturas de Repetição e Arrays em Java
 * - Faça um programa que calcule o fatorial de um numero fornecido pelo usuário
 *   Ex: 5! = 120
 */

public class Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numFatorial;
        int fatorial = 1;
        do{
            System.out.println("Informe o valor: ");
            numFatorial = scan.nextInt();
            if (numFatorial<0)
                System.out.println("O valor precisa ser positivo...");
        }while (numFatorial<0);

        for (int i = numFatorial; i > 0; i--) {
            fatorial *= i;
        }
        System.out.println(numFatorial+ "! = " + fatorial);
    }
}
