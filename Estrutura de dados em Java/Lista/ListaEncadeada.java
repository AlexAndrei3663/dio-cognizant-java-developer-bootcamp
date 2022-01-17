package Lista;

import Introducao.projetoNo.No;

public class ListaEncadeada<T> {

    // No de referencia, aponta para o primeiro no da lista
    private No<T> refNode;
    
    // Construtor da classe
    public ListaEncadeada (){
        this.refNode = null;
    }

    // Metodo pra verificar se a lista esta vazia
    public boolean isEmpty() {
        return refNode == null ? true : false;
    }

    // Metodo para retornar o tamanho da lista
    public int size() {
        int lenght = 0;
        No<T> auxNode = refNode;

        while (auxNode != null) {
            auxNode = auxNode.getProximoNo();
            lenght++;
        } 

        return lenght;
    }

    // Metodo para retornar o ultimo no da lista
    private No<T> last() {
        if (this.isEmpty())
            return null;

        No<T> auxNodeiliar = refNode;
        
        while (auxNodeiliar.getProximoNo() != null) {
            auxNodeiliar = auxNodeiliar.getProximoNo();
        }

        return auxNodeiliar;
    }

    // Metodo para retornar a partir de um indice
    private No<T> getNode(int index) {
        validateIndex(index);

        No<T> auxNode = refNode;
        for(int i=0; i<index; i++){
            auxNode = auxNode.getProximoNo();
        }
        return auxNode;
    }

    // Metodo para adicionar um novo elemento na lista
    // A partir do dado
    public void add(T data) {
        if (this.isEmpty())
            refNode = new No<>(data);
        else{
            No<T> lastNode = this.last();
            lastNode.setProximoNo(new No<>(data));
        }
    }

    // Metodo para adicionar um novo elemento na lista
    // A partir do dado, no index especificada
    public void add(T data, int index) {
        No<T> newNode = new No<T>(data);

        if (index == 0){
            newNode.setProximoNo(refNode);
            refNode = newNode;
        }
        else{
            No<T> auxNode = getNode(index-1);
            newNode.setProximoNo(auxNode.getProximoNo());
            auxNode.setProximoNo(newNode);
        }
    }

    // Metodo para recuperar o conteudo do no especificado
    public T get(int index) {
        return getNode(index).getConteudo();
    }

    // Metodo para remover um no e retornar seu conteudo
    public T remove(int index) {
        No<T> removedNode = getNode(index);

        if (index == 0)
            refNode = removedNode.getProximoNo();
        else{    
            No<T> auxNode = getNode(index - 1);
            auxNode.setProximoNo(removedNode.getProximoNo());
        }

        return removedNode.getConteudo();
    }

    // Metodo para validar um indice na lista
    private void validateIndex(int index) {
        if (this.isEmpty())
            throw new IndexOutOfBoundsException("A lista esta vazia");
        else if (index>this.size() || index<0)
            throw new IndexOutOfBoundsException("O indice fornecido e invalido");
    }

    @Override
    public String toString() {
        String stringReturn = "-------------\n";
        stringReturn += "Lista Encadeada\n";
        stringReturn += "-------------\n";
        
        No<T> auxNode = refNode;

        while (auxNode != null) {
            stringReturn += auxNode.toString() + " -> ";
            auxNode = auxNode.getProximoNo();
        }

        stringReturn += "null\n=============\n";
        return stringReturn;
    }
}