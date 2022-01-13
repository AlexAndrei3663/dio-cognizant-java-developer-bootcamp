package Introducao.atribuicaoReferencia;

/**
 * Exercicio proposto em aula para entender a diferença entre
 * atribuição direta a uma variavel
 * e referencia a um endereço de memoria.
 */
public class AtribucaoReferencia {
    public static void main(String[] args) {
        // Atribuição de valor
        int intA = 2;
        int intB = intA;
        
        System.out.println("intA: " + intA + ", intB: " + intB);
        intA += 2;
        System.out.println("intA: " + intA + ", intB: " + intB);

        // Atribuição de referencia
        MeuObj objA = new MeuObj(1);
        MeuObj objB = objA;

        System.out.println("objA: " + objA + ", objB: " + objB);
        objA.setNum(2);;
        System.out.println("ObjA: " + objA + ", objB: " + objB);
    }
}