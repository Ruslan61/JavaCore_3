package lesson4.homework;

public class Main {
    public static void main(String[] args) {

        Print print = new Print();
        new Thread(() -> print.printA()).start();
        new Thread(() -> print.printB()).start();
        new Thread(() -> print.printC()).start();

    }
}
