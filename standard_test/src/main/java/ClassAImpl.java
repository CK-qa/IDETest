public class ClassAImpl extends ClassA {
    public ClassAImpl(int i, float f, short sh, long l) {
        super(i, f, sh, l);
    }

    /**
     * Test
     *
     * <b>Test</b>
     */
    public void transform() {
    }

    public static void method(String one) {
        String two = one + "lalala";
        String three = two + "pewpew";
    }

    public void method(String one, String two) {
    }

    public void method(String one, String two, String three) {
    }

    public void test() {
        show();

        method("ssdsdsdsssdsdjhjhd");
    }

    public static void main(String[] args) {
        method("pewpввввewрврврetetet");
    }

    @Override
    void show() { System.out.println("Child's show()"); }
}