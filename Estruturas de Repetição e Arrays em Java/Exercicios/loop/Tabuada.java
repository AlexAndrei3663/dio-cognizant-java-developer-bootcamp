package loop;

import java.util.Scanner;

/**
 * Exercício proposto na aula 2 do Estruturas de Repetição e Arrays em Java
 * - Faça um programa que gere uma tabuada de qualquer numero inteiro de 1 a 10.
 *   O usuario qual numero ele quer ver a tabuada.
 *      -> Ex: loop.Tabuada do número 5
 *             5 x 0 = 0
 *             5 x 1 = 5
 *             5 x 2 = 10
 *             ...
 *             5 x 10 = 50
 */

public class Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numTabuada;

        do{
            System.out.println("Informe o valor que deseja da tabuada de 1 a 10: ");
            numTabuada = scan.nextInt();
            if (numTabuada>10 || numTabuada<1)
                System.out.println("Valor informado é invalido...");
        }while (numTabuada>10 || numTabuada<1);

        System.out.println("loop.Tabuada do número " + numTabuada);
        for (int i=0; i<=10; i++){
            System.out.println(numTabuada + " x " + i + " = " + numTabuada*i);
        }
    }
}
