package core_labels;

public class WrappingLines extends Duplicates {
    public static void main(String[] args) {

        for (String arg : args) {
            System.out.println(arg);
            for (int j = 0; j < 10; j++) {
                System.out.println("ololo");
            }
        }
    }

    @Override

    public void test() {
        super.test();
    }
}