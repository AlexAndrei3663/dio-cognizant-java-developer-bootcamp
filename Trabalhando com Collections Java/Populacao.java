import java.util.*;

/**
 * Exercício proposto na aula Map do cursos Trabalhando com Collections Java
 * 
 * Dada a população estimada de alguns estados do NE brasileiro, faça:
 *      Estado = PE - População = 9.616.621
 *      Estado = AL - População = 3.351.543
 *      Estado = CE - População = 9.187.103
 *      Estado = RN - População = 3.534.265
 * 
 * - Crie um dicionario que relacione os estados e suas populações;
 * - Substitua a população do estado RN por 3.534.165;
 * - Confira se o estado da PB está no dicionário, caso não adicione: 4.039.277;
 * - Exiba a população de PE;
 * - Exiba todos os estados e suas populações na ordem em que foi informado;
 * - Exiba os estados e suas populações em ordem alfabética;
 * - Exiba o estado com menor população e sua quantidade;
 * - Exiba o estado com maior população e sua quantidade;
 * - Exiba a soma das populações desses estados;
 * - Exiba a média da população desse dicionário de estados;
 * - Remova os estados com população menor que 4.000.000;
 * - Apague o dicionario de estados e confira se o dicionario está vazio; 
 */

public class Populacao {
    public static void main(String[] args) {
        Map<String, Integer> meusEstados = new LinkedHashMap<>();
        meusEstados.put("PE", 9616621);
        meusEstados.put("AL", 3351543);
        meusEstados.put("CE", 9187103);
        meusEstados.put("RN", 3534265);
        System.out.println("Estados adicionados");
        System.out.println(meusEstados);

        meusEstados.replace("RN", 3534165);
        System.out.println("\nAtualização de valor");
        System.out.println(meusEstados);

        if (!meusEstados.containsKey("PB"))
            meusEstados.put("PB", 4039277);
        System.out.println("\nAdição de estado");
        System.out.println(meusEstados);

        System.out.println("\nA população de PE é " + meusEstados.get("PE"));

        System.out.println("\nOrdem Informada");;
        for (Map.Entry<String, Integer> estado: meusEstados.entrySet()) {
            System.out.println(estado);
        }

        System.out.println("\nOrdem Alfabética");
        Map<String, Integer> meusEstadosTree = new TreeMap<>(meusEstados);
        for (Map.Entry<String, Integer> estado: meusEstadosTree.entrySet()) {
            System.out.println(estado);
        }

        int menorPopulacao = Collections.min(meusEstados.values());
        int maiorPopulacao = Collections.max(meusEstados.values());
        String maiorEstado = "", menorEstado = "";
        int soma = 0;
        for (Map.Entry<String, Integer> estado : meusEstados.entrySet()) {
            if (menorPopulacao == estado.getValue())
                menorEstado = estado.getKey();

            if (maiorPopulacao == estado.getValue())
                maiorEstado = estado.getKey();

            soma += estado.getValue();
        }

        System.out.println("\nAlguns dados sobre os estados");
        System.out.println("O estado com maior população é " + maiorEstado);
        System.out.println("O estado com menor população é " + menorEstado);
        System.out.println("A soma da população dos estados é " + soma);
        System.out.println("A media da população dos estados é " + (soma/meusEstados.size()));

        Iterator<Integer> populacao = meusEstados.values().iterator();
        while (populacao.hasNext()) {
            if (populacao.next() < 4000000)
                populacao.remove();
        }
        System.out.println("\nEstados com população maior que 4.000.000");
        System.out.println(meusEstados);

        System.out.println("\nEsvaziando dicionario...");
        meusEstados.clear();
        System.out.println("Dicionario vazio? " + meusEstados.isEmpty());
    }
}