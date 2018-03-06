public class ClassBi extends ClassA implements Interface {

    static String one;
    static String two;

    public ClassBi(int i, float f, short sh, long l) {
        super(i, f, sh, l);
    }


    public static void function() {
        if (one.contains("A")) {
            System.out.println("...yes...");
            if (two.contains("!")) {
                System.out.println("Bingo!");
            } else System.out.println("You're loser");
        }
    }

    private static final String ALPHA_NUMERIC_STRING = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    private static final String ALPHA_NUMERIC_STRING_2 = "!@#$%^&*()_+";

    private static String randomAlphaNumeric(int count, String randomSource) {
        StringBuilder builder = new StringBuilder();
        for (int i = count; i > 0; i--) {

            int character = (int) (Math.random() * randomSource.length());
            builder.append(randomSource.charAt(character));
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        one = randomAlphaNumeric(5, ALPHA_NUMERIC_STRING);
        two = randomAlphaNumeric(5, ALPHA_NUMERIC_STRING_2);


        if (one.equals(two)) {
            System.out.println("one (" + one + ") == two (" + two + ")");
            System.out.println("one is " + one + " and it's equal to two which is " + two);
        } else {
            System.out.println("one (" + one + ") != two (" + two + ")");
            System.out.println("one is " + one + " and it's not equal to two which is " + two);
        }

        function();
    }

    public static int intValue() {
        return 1;
    }

    public void function_1() {

    }

    public static String getOne() {
        return one;
    }
}
