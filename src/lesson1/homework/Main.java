package lesson1.homework;

import java.util.ArrayList;
import java.util.Arrays;

public class Main<T> {
    public static void main(String[] args) {
        // Задание 1
        Main<String> array = new Main<>(new String[]{"A", "B", "C", "D", "E"});
        System.out.println(Arrays.toString(array.getObj()));
        arrElementReverse(array.getObj(), 1, 3);

        // Задание 2
        ArrayList<String> stringArrayList = createArrayList(array.getObj());
        System.out.println(stringArrayList);

        // Задание 3
        Box<Apple> appleBox1 = new Box<>();
        appleBox1.addFruit(new Apple());

        Box<Apple> appleBox2 = new Box<>();
        appleBox2.addFruit(new Apple());

        Box<Orange> orangeBox1 = new Box<>();
        orangeBox1.addFruit(new Orange());

        System.out.println(appleBox1.getWeight());
        System.out.println(appleBox2.getWeight());
        appleBox1.shiftFruits(appleBox2);
        System.out.println(appleBox1.getWeight());
        System.out.println(appleBox2.getWeight());

        System.out.println(orangeBox1.getWeight());
        System.out.println(appleBox1.compare(orangeBox1));
        System.out.println(orangeBox1.getWeight());
    }

    public T[] obj;

    public Main(T[] obj) {
        this.obj = obj;
    }

    public T[] getObj() {
        return obj;
    }

    // Задание 1
    public static <T> void arrElementReverse(T[] obj, int i, int j) {
        T a = obj[i];
        obj[i] = obj[j];
        obj[j] = a;
        System.out.println(Arrays.toString(obj));
    }

    // Задание 2
    public static <T> ArrayList<T> createArrayList(T[] arr) {
        return new ArrayList<>(Arrays.asList(arr));
    }
}