package Lista;

public class testandoListas {
    public static void main(String[] args) {
         testeListaCircular();
    }

    // Metodo para testar a lista encadeada
    public static void testeListaEncadeada() {
        ListaEncadeada<Integer> minhaListaEncadeada = new ListaEncadeada<>();

        minhaListaEncadeada.add(1);
        minhaListaEncadeada.add(2);
        minhaListaEncadeada.add(3);
        minhaListaEncadeada.add(4);
        minhaListaEncadeada.add(5);
        minhaListaEncadeada.add(6);

        System.out.println(minhaListaEncadeada);

        minhaListaEncadeada.add(100, 3);

        System.out.println(minhaListaEncadeada);

        System.out.println(minhaListaEncadeada.get(3));

        System.out.println(minhaListaEncadeada.remove(3));

        System.out.println(minhaListaEncadeada);
    }

    // Metodo para testar a lista duplamente encadeada
    public static void testeListaDuplamenteEncadeada() {
        ListaDuplamenteEncadeada<Integer> minhaListaDuplamenteEncadeada = new ListaDuplamenteEncadeada<>();

        System.out.println(minhaListaDuplamenteEncadeada.remove(3));

        minhaListaDuplamenteEncadeada.add(1);
        System.out.println(minhaListaDuplamenteEncadeada);

        System.out.println(minhaListaDuplamenteEncadeada.remove(0));

        minhaListaDuplamenteEncadeada.add(1);
        minhaListaDuplamenteEncadeada.add(2);
        minhaListaDuplamenteEncadeada.add(3);
        minhaListaDuplamenteEncadeada.add(4);
        minhaListaDuplamenteEncadeada.add(5);
        minhaListaDuplamenteEncadeada.add(6);

        System.out.println(minhaListaDuplamenteEncadeada);

        minhaListaDuplamenteEncadeada.add(100, 3);
        System.out.println(minhaListaDuplamenteEncadeada);

        System.out.println(minhaListaDuplamenteEncadeada.get(3));

        System.out.println(minhaListaDuplamenteEncadeada.remove(3));
        System.out.println(minhaListaDuplamenteEncadeada);
        
        System.out.println(minhaListaDuplamenteEncadeada.remove(5));
        System.out.println(minhaListaDuplamenteEncadeada);
    }

    // Metodo para testar a lista circilar
    public static void testeListaCircular() {
        ListaCircular<Integer> minhaListaCircular = new ListaCircular<>();

        System.out.println(minhaListaCircular.remove(3));

        minhaListaCircular.add(1);
        System.out.println(minhaListaCircular);

        System.out.println(minhaListaCircular.remove(0));

        minhaListaCircular.add(1);
        minhaListaCircular.add(2);
        minhaListaCircular.add(3);
        minhaListaCircular.add(4);
        minhaListaCircular.add(5);
        minhaListaCircular.add(6);

        System.out.println(minhaListaCircular);

        minhaListaCircular.add(100, 3);
        System.out.println(minhaListaCircular);

        System.out.println(minhaListaCircular.get(3));
        System.out.println(minhaListaCircular.get(5));
        System.out.println(minhaListaCircular.get(10));

        System.out.println(minhaListaCircular.remove(3));
        System.out.println(minhaListaCircular);
        
        System.out.println(minhaListaCircular.remove(5));
        System.out.println(minhaListaCircular);
    }
}
