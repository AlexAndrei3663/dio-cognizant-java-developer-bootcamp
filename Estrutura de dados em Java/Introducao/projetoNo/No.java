package Introducao.projetoNo;

public class No<T>{
    
    private T conteudo;
    private No<T> proximoNo;
    private No<T> noAnterior;

    public No() {
        this.proximoNo = null;
        this.noAnterior = null;
    }

    public No(T conteudo) {
        this.proximoNo = null;
        this.noAnterior = null;
        this.conteudo = conteudo;
    }

    public No(T conteudo, No<T> proximoNo) {
        this.proximoNo = proximoNo;
        this.noAnterior = null;
        this.conteudo = conteudo;
    }

    public No(No<T> noAnterior, T conteudo) {
        this.proximoNo = null;
        this.noAnterior = noAnterior;
        this.conteudo = conteudo;
    }

    public No(T conteudo, No<T> noAnterior, No<T> proximoNo) {
        this.proximoNo = proximoNo;
        this.noAnterior = noAnterior;
        this.conteudo = conteudo;
    }

    

    public T getConteudo() {
        return conteudo;
    }

    public No<T> getProximoNo() {
        return proximoNo;
    }

    public No<T> getNoAnterior() {
        return noAnterior;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public void setProximoNo(No<T> proximoNo) {
        this.proximoNo = proximoNo;
    }

    public void setNoAnterior(No<T> noAnterior) {
        this.noAnterior = noAnterior;
    }

    
    @Override
    public String toString() {
        return "No{" + conteudo + "}";
    }

}
