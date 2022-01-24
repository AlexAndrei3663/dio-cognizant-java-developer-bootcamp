import java.util.*;

/**
 * Exercício proposto na aula Set do cursos Trabalhando com Collections Java
 * 
 * Crie um conjunto contendo as cores do arco-iris e:
 * - Exiba todas as cores, uma abaixo da outra
 * - A quantidade de cores que o arco-iris tem
 * - Exiba as cores em ordem alfabética
 * - Exiba as cores em ordem inversa da que foi informada
 * - Exiba as cores que comecem com a lera 'v'
 * - Remova todas as cores que não começam com a letra 'v'
 * - Limpe o conjunto
 */

public class ArcoirisSet {
    public static void main(String[] args) {
        Set<String> meuArcoiris = new LinkedHashSet<>();

        meuArcoiris.add("Vermelho");
        meuArcoiris.add("Laranja");
        meuArcoiris.add("Amarelo");
        meuArcoiris.add("Verde");
        meuArcoiris.add("Azul");
        meuArcoiris.add("Anil");
        meuArcoiris.add("Violeta");

        for (String cor : meuArcoiris) {
           System.out.println(cor);
        }
        
        System.out.println("O arco-iris tem " + meuArcoiris.size() + " cores");

        Set<String> meuArcoirisTree = new TreeSet<>(meuArcoiris);

        System.out.println(meuArcoirisTree);

        List<String> corInvertida = new ArrayList<>(meuArcoiris);
        Collections.reverse(corInvertida);
        System.out.println(corInvertida);

        for (String cor : meuArcoiris) {
            if (cor.startsWith("v") || cor.startsWith("V"))
                System.out.println(cor);
         }

         Iterator<String> iteratirCor = meuArcoiris.iterator();
         while(iteratirCor.hasNext()){
            String cor = iteratirCor.next();
            if (!(cor.startsWith("v") || cor.startsWith("V")))
                iteratirCor.remove();
         }
         System.out.println(meuArcoiris);

         meuArcoiris.clear();
         System.out.println(meuArcoiris);

    }
    
}