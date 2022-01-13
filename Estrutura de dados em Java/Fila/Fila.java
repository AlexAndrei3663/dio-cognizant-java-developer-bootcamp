package Fila;

import Introducao.projetoNo.No;

public class Fila<T> {
    private No<T> noRef; // Aponta para o primeiro no da fila

    public Fila() {
        this.noRef = null;
    }

    public No<T> first() {
        return noRef; 
    }

    // Talvez criar um outro no de ref para o ultimo
    // reduzindo assim a complexidade do metodo
    public No<T> last() {
        if (isEmpty())
            return null;

        No<T> noAuxiliar = noRef;
        
        while (noAuxiliar.getProximoNo() != null) {
            noAuxiliar = noAuxiliar.getProximoNo();
        }

        return noAuxiliar;
    }

    public boolean isEmpty() {
        return noRef == null ? true : false;
    }

    public void enqueue(T dado) {
        if (this.isEmpty())
            noRef = new No<>(dado);
        else{
            No<T> ultimoNo = this.last();
            ultimoNo.setProximoNo(new No<>(dado));
        }
    }

    public void enqueue(No<T> novoNo) {
        if (this.isEmpty())
            noRef = novoNo;
        else{
            No<T> ultimoNo = this.last();
            ultimoNo.setProximoNo(novoNo);
        }
    }

    public No<T> dequeue() {
        if (isEmpty())
            return null;
        
        No<T> noAuxiliar = noRef;
        noRef = noRef.getProximoNo();
        return noAuxiliar;
    }

    @Override
    public String toString() {
        String stringReturn = "-------------\n";
        stringReturn += "Fila\n";
        stringReturn += "-------------\n";
        
        if (!this.isEmpty()){
            No<T> noAuxiliar = noRef;

            stringReturn += noAuxiliar.toString();
            
            while (noAuxiliar != null) {
                stringReturn += " <- " + noAuxiliar.toString();
                noAuxiliar = noAuxiliar.getProximoNo();
            }
        }

        stringReturn += "\n=============\n";
        return stringReturn;
    }
}
