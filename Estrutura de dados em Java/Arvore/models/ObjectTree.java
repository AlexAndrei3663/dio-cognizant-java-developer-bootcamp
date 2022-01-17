package Arvore.models;

public abstract class ObjectTree<T> implements Comparable<T> {
    public abstract boolean equals(Object o);
    public abstract int hashcode();
    public abstract int compareTo(T other);
    public abstract String toString();
}
