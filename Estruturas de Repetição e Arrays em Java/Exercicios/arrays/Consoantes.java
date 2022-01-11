package arrays;

import java.util.Scanner;

/**
 * Exercício proposto na aula 3 do Estruturas de Repetição e Arrays em Java
 * - Faça um programa que leia um vetor de 6 caracteres, e diga quantas
 *   consoantes foram lidas.
 *      -> Valor inserido será obrigatoriamente uma letra
 *      -> Só será inserido um caracter por vez
 * - Imprima as consoantes.
 */
public class Consoantes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] consoantes = new String[6];
        int quantConsoantes = 0;

        for(int i = 0; i < consoantes.length; i++){
            System.out.println("Digite uma letra (" + (i+1) + "/" + consoantes.length + "): ");
            String letra = scan.next();

            // Se não for uma vogal, significa que é uma consoante
            if(!(letra.equalsIgnoreCase("a") ||
                    letra.equalsIgnoreCase("e") ||
                    letra.equalsIgnoreCase("i") ||
                    letra.equalsIgnoreCase("o") ||
                    letra.equalsIgnoreCase("u"))){
                consoantes[quantConsoantes] = letra;
                quantConsoantes++;
            }
        }
        System.out.println("Foram digitadas " + quantConsoantes + " consoantes");
        System.out.print("Consoantes digitadas: ");
        for ( String consoante : consoantes ) {
            if(consoante != null)
                System.out.print(consoante + " ");
        }
    }
}
