public class ClassB extends ClassA implements Interface {

    static String one;
    static String two;


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
        for (int i = count; i > 0 ; i--) {

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
        } else {
            System.out.println("one (" + one + ") != two (" + two + ")");
        }

        function();
    }

    public void function_1() {

    }
}
