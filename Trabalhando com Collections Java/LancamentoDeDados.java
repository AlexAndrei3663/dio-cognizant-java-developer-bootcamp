import java.util.*;

/**
 * Desafio proposto na aula Map do cursos Trabalhando com Collections Java
 * 
 * Faça um programa que simule um lançamento de dados.
 * Lance o dado 100 vezes e armazene.
 * Depois, mostre quantas vezes cada valor foi inserido.
 */

public class LancamentoDeDados {
    public static void main(String[] args) {
        Random rnd = new Random();
        Map<Integer, Integer> resultadosDados = new LinkedHashMap<>(){{
            put(1,0); put(2,0); put(3,0); put(4,0); put(5,0); put(6,0);}};

        System.out.println("Lançando dado");
        int dado;
        for (int i = 0; i < 100; i++) {
            dado = rnd.nextInt(1, 7);
            System.out.print(dado + ", ");
            resultadosDados.replace(dado, resultadosDados.get(dado)+1);
        }

        System.out.println("\n\nResultado");
        for (Map.Entry<Integer, Integer> resultado : resultadosDados.entrySet()) {
            System.out.println(resultado);
        }
    }
}