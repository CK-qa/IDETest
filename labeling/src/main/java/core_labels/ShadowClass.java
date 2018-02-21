package core_labels;

public class ShadowClass {

    public int x = 0;

    class FirstLevel {

        public int x = 1;

        void methodInFirstLevel(int x) {
            System.out.println("x = " + x);
            System.out.println("this.x = " + this.x);
            System.out.println("ShadowTest.this.x = " + ShadowClass.this.x);
        }
    }

    public static void main(String... args) {
        ShadowClass st = new ShadowClass();
        ShadowClass.FirstLevel fl = st.new FirstLevel();
        fl.methodInFirstLevel(23);
    }
}