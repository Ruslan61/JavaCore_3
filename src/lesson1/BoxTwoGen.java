package lesson1;

public class BoxTwoGen<T, N> {
    private T tobj1;
    private T tobj2;
    private N nobj1;

    public BoxTwoGen(T tobj1, T tobj2, N nobj1) {
        this.tobj1 = tobj1;
        this.tobj2 = tobj2;
        this.nobj1 = nobj1;
    }

    public void info() {
        System.out.println("t1: " + tobj1.getClass().getSimpleName() + " = " + tobj1);
        System.out.println("t2: " + tobj2.getClass().getSimpleName() + " = " + tobj2);
        System.out.println("n1: " + nobj1.getClass().getSimpleName() + " = " + nobj1);
    }
}
