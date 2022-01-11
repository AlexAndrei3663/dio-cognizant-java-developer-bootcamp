package loop;

import java.util.Scanner;

/**
 * Exercício proposto na aula 2 do Estruturas de Repetição e Arrays em Java
 * - Faça um programa que peça uma nota entre 0 e 10.
 *      -> Mostre uma mensagem caso o valor seja invalido e continue pedindo
 *         até que o usuario informe um valor valido.
 */

public class Nota {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nota;

        while(true){
            System.out.println("Digite a sua nota: ");
            nota = scan.nextInt();

            if(nota>10 || nota<0)
                System.out.println("loop.Nota invalida!!\nDigite um novo valor...\n");
            else break;
        }

        System.out.println("Valor Aceito...");
    }
}