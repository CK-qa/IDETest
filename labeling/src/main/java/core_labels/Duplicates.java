package core_labels;

public class Duplicates {

    public static void main(String[] args) {
        test0(1, 2);
    }

    public int test(int a, int b) {
        a=b;
        return a + b;
    }

    public static int test0(int c, int d) {
        return c + d;
    }

    public static int test1(int c, int d) {
        return c + d;
    }

    public static int test2(int c, int d) {
        return c + d;
    }

    public static int test3(int c, int d) {
        return c + d;
    }

    public static int test4(int c, int d) {
        return c + d;
    }

    public static int test5(int c, int d) {
        return c + d;
    }

    public void test() {
        System.out.println("tetete");
    }
}
