package Arvore;

// Classe similar a classe no,
// mas adaptada para podermos usar o coparable.
public class Node<T extends Comparable<T>> {
    private T data;
    private Node<T> leftNode;
    private Node<T> rightNode;

    public Node(T data) {
        this.data = data;
        this.leftNode = this.rightNode = null;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node<T> getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(Node<T> leftNode) {
        this.leftNode = leftNode;
    }

    public Node<T> getRightNode() {
        return rightNode;
    }

    public void setRightNode(Node<T> rightNode) {
        this.rightNode = rightNode;
    }

    public String getNode(){
        return "No{ " + this.leftNode + " <- " + this.data + " -> " + this.rightNode + " }";
    }

    @Override
    public String toString() {
        return "No{" + data + "}";

    }
}
