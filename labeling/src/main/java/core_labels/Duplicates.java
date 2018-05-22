package core_labels;

public class Duplicates {

    public int test(int a, int b) {
        return a + b;
    }

    public static int test0(int c, int d) {
        return c + d;
    }

    public static void main(String[] args) {
        test0(1, 2);
    }
}