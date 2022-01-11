package loop;

import java.util.Scanner;

/**
 * Exercício proposto na aula 2 do Estruturas de Repetição e Arrays em Java
 * - Faça um programa que leia um conjunto de dois valores,
 *   o primeiro representa o nome do aluno e o segundo representa a sua idade.
 *      -> Pare o programa inserindo o valor 0 no campo nome
 */

public class NomeIdade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nome;
        int idade;

        while(true){
            System.out.println("Digite seu nome: ");
            nome = scan.next();
            if(nome.equals("0")) break;

            System.out.println("Digite sua idade: ");
            idade = scan.nextInt();

            System.out.println("Seu nome é " + nome + " e sua idade é " + idade);
        }
    }

}
