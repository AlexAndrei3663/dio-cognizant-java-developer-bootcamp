package Arvore;

import Arvore.models.Obj;

public class TesteArvore {
    public static void main(String[] args) {
        BinaryTree<Obj> minhaArvore = new BinaryTree<>();

        minhaArvore.add(new Obj(13));
        minhaArvore.add(new Obj(10));
        minhaArvore.add(new Obj(25));
        minhaArvore.add(new Obj(2));
        minhaArvore.add(new Obj(12));
        minhaArvore.add(new Obj(20));
        minhaArvore.add(new Obj(31));
        minhaArvore.add(new Obj(29));

        minhaArvore.inOrder();
        minhaArvore.preOrder();
        minhaArvore.posOrder();

        System.out.println("Max: " + minhaArvore.max());
        System.out.println("Min: " + minhaArvore.min());

        minhaArvore.add(new Obj(32));

        minhaArvore.inOrder();
        minhaArvore.preOrder();
        minhaArvore.posOrder();

        minhaArvore.remove(new Obj(25));

        minhaArvore.inOrder();
        minhaArvore.preOrder();
        minhaArvore.posOrder();
    }
}
