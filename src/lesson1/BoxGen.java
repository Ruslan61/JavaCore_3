package lesson1;

public class BoxGen<T> {
    // E - element  K - key  N - number  T - type  V - value;
    private T obj;

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }

    public BoxGen(T obj) {
        this.obj = obj;
    }
}
