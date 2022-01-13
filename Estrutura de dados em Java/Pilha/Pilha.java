package Pilha;

import Introducao.projetoNo.No;

public class Pilha<T> {
    private No<T> noRef;
    
    public Pilha() {
        this.noRef = null;
    }

    public No<T> pop() {
        if(this.isEmpty())
            return null;
            
        No<T> noPopped = noRef;
        noRef = noRef.getProximoNo();
        return noPopped;
    }

    public void push(T dado) {
        No<T> noRefAux = noRef;
        noRef = new No<T> (dado);
        noRef.setProximoNo(noRefAux);
    }

    public void push(No<T> novoNo) {
        No<T> noRefAux = noRef;
        noRef = novoNo;
        noRef.setProximoNo(noRefAux);
    }

    public No<T> top() {
        return noRef;
    }

    public boolean isEmpty() {
        /* if (noRef == null)
            return true;
        return false; */
        return noRef == null ? true : false;
    }

    @Override
    public String toString() {
        String stringReturn = "-------------\n";
        stringReturn += "Pilha\n";
        stringReturn += "-------------\n";
        
        No<T> noAuxiliar = noRef;
        while (noAuxiliar != null) {
            stringReturn += noAuxiliar.toString() + "\n";
            noAuxiliar = noAuxiliar.getProximoNo();
        }

        stringReturn += "=============\n";

        return stringReturn;
    }
}
