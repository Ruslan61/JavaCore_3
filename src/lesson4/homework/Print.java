package lesson4.homework;

public class Print {

    private static Object obj = new Object();
    private volatile char abc = 'A';

    public void printA() {
        synchronized (obj) {
            try {
                for (int i = 0; i < 5; i++) {
                    while (abc != 'A')
                        obj.wait();
                    System.out.print("A");
                    abc = 'B';
                    obj.notifyAll();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void printB() {
        synchronized (obj) {
            try {
                for (int i = 0; i < 5; i++) {
                    while (abc != 'B')
                        obj.wait();
                    System.out.print("B");
                    abc = 'C';
                    obj.notifyAll();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void printC() {
        synchronized (obj) {
            try {
                for (int i = 0; i < 5; i++) {
                    while (abc != 'C')
                        obj.wait();
                    System.out.print("C");
                    abc = 'A';
                    obj.notifyAll();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
