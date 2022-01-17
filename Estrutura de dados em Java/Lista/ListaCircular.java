package Lista;

import Introducao.projetoNo.No;

public class ListaCircular<T> {
    // No de referencia, aponta para o primeiro no da lista
    private No<T> headNode;
    private No<T> tailNode;
    private int lenght;
    
    // Construtor da classe
    public ListaCircular (){
        this.headNode = null;
        this.tailNode = null;
        this.lenght = 0;
    }

    // Metodo pra verificar se a lista esta vazia
    public boolean isEmpty() {
        return this.lenght == 0 ? true : false;
    }

    // Metodo para retornar o tamanho da lista
    public int size() {
        return this.lenght;
    }

    // Metodo para retornar a partir de um indice
    private No<T> getNode(int index) {

        No<T> auxNode = tailNode;
        for(int i=0; i<index; i++){
            auxNode = auxNode.getProximoNo();
        }
        return auxNode;
    }

    // Metodo para adicionar um novo elemento na lista
    // A partir do dado
    public void add(T data) {
        No<T> newNode = new No<>(data);

        newNode.setProximoNo(tailNode);
        tailNode = newNode;

        if (this.isEmpty())
            headNode = tailNode;
        else
            headNode.setProximoNo(newNode);
        this.lenght++;
    }

    // Metodo para adicionar um novo elemento na lista
    // A partir do dado, no index especificada
    public void add(T data, int index) {
        if (index == 0)
            this.add(data);
        else{
            No<T> newNode = new No<T>(data);
            No<T> auxNode = getNode(index-1);
            newNode.setProximoNo(auxNode.getProximoNo());
            auxNode.setProximoNo(newNode);
        }
        this.lenght++;
    }

    // Metodo para recuperar o conteudo do no especificado
    public T get(int index) {
        return getNode(index).getConteudo();
    }

    // Metodo para remover um no e retornar seu conteudo
    public T remove(int index) {
        if (this.isEmpty())
            return null;

        No<T> removedNode = getNode(index);

        if (index == 0){
            tailNode = removedNode.getProximoNo();
            headNode.setProximoNo(tailNode);
        }
        else{    
            No<T> auxNode = getNode(index - 1);
            auxNode.setProximoNo(removedNode.getProximoNo());
            if (index == this.size()-1)
                headNode = auxNode;
        }
        this.lenght--;
        return removedNode.getConteudo();
    }

    @Override
    public String toString() {
        String stringReturn = "-------------\n";
        stringReturn += "Lista Circular\n";
        stringReturn += "-------------\n";
        
        No<T> auxNode = tailNode;
        for (int i = 0; i < this.size()/2; i++) {
            stringReturn += " -> " + auxNode.toString();
            auxNode = auxNode.getProximoNo();
        }
        String newLine = "";
        for (int i = this.size()-1; i >= this.size()/2; i--) {
            newLine = auxNode.toString() + " <- " + newLine;
            auxNode = auxNode.getProximoNo();
        }

        if (!newLine.isEmpty())
            stringReturn += " -> \n <- " + newLine;
        stringReturn += "\n=============\n";
        return stringReturn;
    }
}
