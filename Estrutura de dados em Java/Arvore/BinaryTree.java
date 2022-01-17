package Arvore;

public class BinaryTree<T extends Comparable<T>> {
    
    private Node<T> root; // Raiz da arvore

    // Construtor da classe
    public BinaryTree() {
        this.root = null;
    }

    // Metodo para encontra o maior no da arvore
    public Node<T> max(){
        if (this.isEmpty())
            return null;

        Node<T> currentNode = this.root;
        if (currentNode.getRightNode() != null)
            currentNode = max(currentNode.getRightNode());

        return currentNode;
    }

    // Metodo para encontra o maior no da subarvore
    private Node<T> max(Node<T> currentNode){
        if (currentNode == null)
            return null;
        
        if (currentNode.getRightNode() != null)
            currentNode = max(currentNode.getRightNode());
        
        return currentNode;
    }

    // Metodo para encontra o menor no da arvore
    public Node<T> min(){
        if (this.isEmpty())
            return null;

        Node<T> currentNode = this.root;
        if (currentNode.getLeftNode() != null)
            currentNode = min(currentNode.getLeftNode());

        return currentNode;
    }

    // Metodo para encontra o menor no da subarvore
    private Node<T> min(Node<T> currentNode){
        if (currentNode == null)
            return null;
        
        if (currentNode.getLeftNode() != null)
            currentNode = min(currentNode.getLeftNode());
        
        return currentNode;
    }

    // Metodo para adicionar um novo no na arvore
    public void add(T data){
        Node<T> newNode = new Node<>(data);
        this.root = add(root, newNode);
    }

    // Metodo para adicionar um novo no na arvore de acordo com a condição
    // menor <- noAtual -> maior igual
    private Node<T> add(Node<T> currentNode, Node<T> newNode) {
        if (currentNode == null)
            return newNode;

        // if (newNode < currentNode)
        if (newNode.getData().compareTo(currentNode.getData()) < 0) 
            currentNode.setLeftNode(this.add(currentNode.getLeftNode(), newNode));
        else
            currentNode.setRightNode(this.add(currentNode.getRightNode(), newNode));

        return currentNode;
    }

    // Metodo para remover um item da arvore
    public void remove(T data){
        Node<T> currentNode = this.root;
        Node<T> parentNode = null;

        // Encontrando o no correspondente
        while ((currentNode != null) && (currentNode.getData().compareTo(data) != 0)){
            parentNode = currentNode;

            // if (newNode < currentNode)
            if (currentNode.getData().compareTo(data) < 0) 
                currentNode = currentNode.getRightNode();
            else
                currentNode = currentNode.getLeftNode();
        }

        // Se o no nao encontrado ou arvore vazia
        if (currentNode == null)
            System.err.println("No nao encontrado");
        // Se o no apagado for a raiz
        else if (parentNode == null){
            if (currentNode.getRightNode() != null){
                min(currentNode.getRightNode()).setLeftNode(currentNode.getLeftNode());
                this.root = currentNode.getRightNode();
            } else
                this.root = currentNode.getLeftNode();
        } else{
            if (parentNode.getRightNode().getData().compareTo(currentNode.getData()) >= 0) {
                if (currentNode.getLeftNode() != null){
                    parentNode.setRightNode(currentNode.getLeftNode());
                    max(currentNode.getLeftNode()).setRightNode(currentNode.getRightNode());
                } else
                    parentNode.setRightNode(currentNode.getRightNode());
            } else {
                if (currentNode.getRightNode() != null) {
                    parentNode.setLeftNode(currentNode.getRightNode());
                    min(currentNode.getRightNode()).setLeftNode(currentNode.getLeftNode());
                } else
                    parentNode.setLeftNode(currentNode.getLeftNode());
            }
        }
    }

    // Metodo para imprimir a arcore no modo inOrder
    public void inOrder() {
        System.out.println("\nImprimindo Arvore: inOrder");
        inOrder(this.root);
        System.out.println();
    }

    // Metodo para imprimir a arcore no modo inOrder
    private void inOrder(Node<T> currentNode){
        if (currentNode == null)
            return;
        
        inOrder(currentNode.getLeftNode());
        System.out.print(currentNode.getData() + ", ");
        inOrder(currentNode.getRightNode());
    }

    // Metodo para imprimir a arcore no modo posOrder
    public void posOrder() {
        System.out.println("\nImprimindo Arvore: posOrder");
        posOrder(this.root);
        System.out.println();
    }

    // Metodo para imprimir a arcore no modo posOrder
    private void posOrder(Node<T> currentNode){
        if (currentNode == null)    
            return;

        posOrder(currentNode.getLeftNode());
        posOrder(currentNode.getRightNode());
        System.out.print(currentNode.getData() + ", ");
    }

    // Metodo para imprimir a arcore no modo preOrder
    public void preOrder() {
        System.out.println("\nImprimindo Arvore: preOrder");
        preOrder(this.root);
        System.out.println();
    }

    // Metodo para imprimir a arcore no modo preOrder
    private void preOrder(Node<T> currentNode){
        if (currentNode == null)
            return;

        System.out.print(currentNode.getData() + ", ");
        preOrder(currentNode.getLeftNode());
        preOrder(currentNode.getRightNode());
    }

    // Metodo para verificar se a arvore esta vazia
    public boolean isEmpty() {
        return this.root == null ? true : false;
    }
}
