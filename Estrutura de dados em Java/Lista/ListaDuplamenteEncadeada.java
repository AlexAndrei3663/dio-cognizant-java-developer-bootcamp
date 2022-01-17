package Lista;

import Introducao.projetoNo.No;

public class ListaDuplamenteEncadeada<T> {

    private No<T> firstNode; // Aponta para o primeiro no da lista
    private No<T> lastNode; // Aponta para o ultimo no da lista
    private int lenght; // Tamanho da lista
    
    // Construtor da lista duplamente encadeada
    public ListaDuplamenteEncadeada() {
        firstNode = null;
        lastNode = null;
        lenght = 0;
    }

    // Metodo pra verificar se a lista esta vazia
    public boolean isEmpty() {
        return lenght == 0 ? true : false;
    }

    // Metodo para retornar o tamanho da lista
    public int size() {
        return lenght;
    }

    // Metodo para retornar o no especificado
    private No<T> getNode(int index) {
        validateIndex(index);
        No<T> auxNode;
        if (index < this.size() / 2){
            auxNode = firstNode;
            for (int i = 0; i < index; i++) {
                auxNode = auxNode.getProximoNo();
            }
        }
        else{
            auxNode = lastNode;
            for (int i = (this.size()-1); i > index; i--) {
                auxNode = auxNode.getNoAnterior();
            }
        }
        return auxNode;
    }
    
    // Metodo para retornar o conteudo do no especificado
    public T get(int index){
        return this.getNode(index).getConteudo();
    }

    // Metodo para adicionar um novo elemento na lista
    public void add(T data) {
        No<T> newNode = new No<>(data);
        if (this.isEmpty()){
            firstNode = newNode;
            lastNode = newNode;
        }
        else{
            lastNode.setProximoNo(newNode);
            newNode.setNoAnterior(lastNode);
            lastNode = newNode;
        }
        this.lenght++;
    }
    
    // Metodo para adicionar um novo elemento na lista no index especificada
    public void add(T data, int index) {
        No<T> newNode = new No<T>(data);
        if (this.isEmpty()){
            firstNode = newNode;
            lastNode = newNode;
        }
        else if (index == 0){
            newNode.setProximoNo(firstNode);
            firstNode = newNode;
        }
        else{
            No<T> auxNode = getNode(index);
            newNode.setNoAnterior(auxNode.getNoAnterior());
            newNode.setProximoNo(auxNode);
            auxNode.getNoAnterior().setProximoNo(newNode);
            auxNode.setNoAnterior(newNode);
        }
        this.lenght++;
    }

    // Metodo para remover um no da lista e retornar seu conteudo
    // ... <> {anterior} <> {atual} <> {proximo} <> ...
    // ... <> {ant} <> {prox} <> ... || < {atual} >
    public T remove(int index) {
        if (isEmpty())
            return null;

        No<T> auxNode = getNode(index);
        if (index == 0)
            firstNode = auxNode.getProximoNo();
        else
            auxNode.getNoAnterior().setProximoNo(auxNode.getProximoNo());

        if (index == this.size()-1)
            lastNode = auxNode.getNoAnterior();
        else
            auxNode.getProximoNo().setNoAnterior(auxNode.getNoAnterior());

        lenght--;
        return auxNode.getConteudo();
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
        stringReturn += "Lista Duplamente encadeada\n";
        stringReturn += "-------------\n";
        
        if (!this.isEmpty()){
            No<T> auxNode = firstNode;

            stringReturn += auxNode.toString();
            
            while (auxNode.getProximoNo() != null) {
                auxNode = auxNode.getProximoNo();
                stringReturn += " <-> " + auxNode.toString();
            }
        }

        stringReturn += "\n=============\n";
        return stringReturn;
    }
}