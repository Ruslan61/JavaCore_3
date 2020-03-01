package lesson1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(Arrays.asList(10, 20, 30));
        Integer i = getFirstElement(nums);

        List<String> stringList = new ArrayList<>(Arrays.asList("qwe", "asd", "zxc"));
        String s = getFirstElement(stringList);
    }

    public static <T> T getFirstElement(List<T> list) {
        return list.get(0);
    }

    public static double sumOfList(List<? extends Number> numbers) {
        double d = 0;
        for (int i = 0; i < numbers.size(); i++) {
            d += numbers.get(i).doubleValue();
        }
        return d;
    }

    public static void boxWithNumbersGenEx() {
        BoxWithNumbers<Float> floatBox1 = new BoxWithNumbers<>(1f, 2f, 3f);
        BoxWithNumbers<Float> floatBox2 = new BoxWithNumbers<>(1f, 2f, 3f);
        BoxWithNumbers<Integer> intBox = new BoxWithNumbers<>(1, 2, 3);

        System.out.println("floatBox.avg() " + floatBox1.avg());
        System.out.println(floatBox1.sameAvg(floatBox2));

        System.out.println("intBox.avg() " + intBox.avg());
        System.out.println(intBox.sameAvg(floatBox1));
    }

    public static void boxGenEx() {
        BoxGen<Integer> bi1 = new BoxGen<>(20);
        BoxGen<Integer> bi2 = new BoxGen<>(40);

        int sum = bi1.getObj() + bi2.getObj();

        System.out.println(sum);

        BoxGen<String> bis = new BoxGen<>("Java");
        System.out.println(bis.getObj());

        BoxTwoGen<String, Integer> b2g = new BoxTwoGen<>("A", "B", 8);
        b2g.info();
    }

    public static void simpleBoxEx() {
        SimpleBox box1 = new SimpleBox(10);
        SimpleBox box2 = new SimpleBox(20);
        ///
        box1.setObj(65);
        ///
        int sum = (int) box1.getObj() + (int) box2.getObj();

        System.out.println(sum);
    }
}
