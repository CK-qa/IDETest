import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class ClassB extends ClassA implements Interface {

    List<String> list;
    Map<Integer, String> map;
    Set<Integer> set;

    public ClassB(List<String> list, Map<Integer, String> map, Set<Integer> set) {
        this.list = list;
        this.map = map;
        this.set = set;
    }

    public void bar() {

    }

    private static final String ALPHA_NUMERIC_STRING = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    private static final String ALPHA_NUMERIC_STRING_2 = "!@#$%^&*()_+";

    private static String randomAlphaNumeric(int count, String randomSource) {
        StringBuilder builder = new StringBuilder();
        for (int i = count; i > 0 ; i--) {

            int character = (int) (Math.random() * randomSource.length());
            builder.append(randomSource.charAt(character));
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        String one = randomAlphaNumeric(5, ALPHA_NUMERIC_STRING);
        String two = randomAlphaNumeric(5, ALPHA_NUMERIC_STRING_2);


        if (one.equals(two)) {
            System.out.println("one (" + one + ") == two (" + two + ")");
            System.out.println("one is " + one + " and it's equal to two which is " + two);
        } else {
            System.out.println("one (" + one + ") != two (" + two + ")");
            System.out.println("one is " + one + " and it's not equal to two which is " + two);
        }
    }
}
