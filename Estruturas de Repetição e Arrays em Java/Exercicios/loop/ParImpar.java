package loop;

import java.util.Scanner;

/**
 * Exercício proposto na aula 2 do Estruturas de Repetição e Arrays em Java
 * - Faça um programa que leia N números inteiros, calcule e mostre
 *   a quantidade de números pares e impares;
 */

public class ParImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int par = 0;
        int impar = 0;
        int num;
        int quantNum;

        do{
            System.out.println("Digite a quantidade de números: ");
            quantNum = scan.nextInt();
            if (quantNum<1)
                System.out.println("A quantidade de números tem que ser maior que 0...");
        }while (quantNum<1);

        for(int i=0; i<quantNum; i++){
            System.out.println("Digite um número: ");
            num = scan.nextInt();
            if(num % 2 == 0)
                par++;
            else
                impar++;
        }

        System.out.println("A quantidade de números pares é " + par);
        System.out.println("A quantidade de números impares é " + impar);
    }
}
