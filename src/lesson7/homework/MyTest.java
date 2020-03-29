package lesson7.homework;

public class MyTest {
    @Test
    public static void test1() {
        System.out.println("test1");
    }

    @BeforeSuite
    public static void test2() {
        System.out.println("test2");
    }

    @Test
    public static void test8() {
        System.out.println("test8");
    }

    @Test(priority = 2)
    public static void test3() {
        System.out.println("test3");
    }

    @Test(priority = 7)
    public static void test4() {
        System.out.println("test4");
    }

    @AfterSuite
    public static void test5() {
        System.out.println("test5");
    }
}
