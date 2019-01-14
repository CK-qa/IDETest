public class ClassAImpl extends ClassA {
    public ClassAImpl(int i, float f, short sh, long l) {
        super(i, f, sh, l);
    }

    /**
     * TestClass1
     * <b>TestClass1</b>
     *
     */

    /**
     * FIXME: we need to do very important
     *  thing with
     *  the current class
     *  Thread-safe
     */

    public void transform() {
    }

      /**
     * some testClass1
     *
     * @param one
     * @param a   more text
     */

    private static void renamedMethod(String one, int a) {
        String two = one + "lalala";
        String three = two + "pewpew";
    }

    public void renamedMethod(String one, String two) {

    }


    public void renamedMethod(String one, String two, String three) throws Exception {
    }


    public void test() {
        show();
        renamedMethod("ololo", 1);
    }

    public static void main(String[] args) {
        renamedMethod("ololo", 2);
    }

    @Override
    void show() {
        System.out.println("Child's show()");
    }
}