package core_labels;

public class ShadowClass {

    private int x = 0;

    class FirstLevel {

        int x = 1;

        void methodInFirstLevel(int x) {
            System.out.print("x = " + x);
            System.out.println("\nthis.x = " + this.x);
            System.out.println("ShadowTest.this.x = " + ShadowClass.this.x);
        }
    }

    public static void main(String... args) {
        ShadowClass st = new ShadowClass();
        ShadowClass.FirstLevel fl = st.new FirstLevel();
        fl.methodInFirstLevel(23);
        fl.methodInFirstLevel(15);
    }


}