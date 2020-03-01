package lesson1;

public class Box implements Comparable<Box> {
    private int size;

    public Box(int size) {
        this.size = size;
    }

    @Override
    public int compareTo(Box o) {
        return this.size - o.size;
    }

    //    @Override
//    public int compareTo(Object o) {
//        if (o == null) {
//            throw new NullPointerException();
//        }
//        if (!(o instanceof Box)) {
//            throw new RuntimeException();
//        }
//        Box another = (Box) o;
//        return this.size - another.size;
//    }
}
