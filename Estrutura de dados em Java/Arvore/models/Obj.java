package Arvore.models;

import java.util.Objects;

public class Obj extends ObjectTree<Obj>{
    
    Integer myValue;

    public Obj(Integer myValue) {
        this.myValue = myValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Obj obj = (Obj) o;
        return Objects.equals(myValue, obj.myValue);
    }

    @Override
    public int hashcode() {
        return Objects.hash(myValue);
    }

    @Override
    public int compareTo(Obj other) {
        if (this.myValue > other.myValue)
            return 1;
        else if (this.myValue < other.myValue)
            return -1;
        else
            return 0;
    }

    @Override
    public String toString() {
        return myValue.toString();
    }
    
}
