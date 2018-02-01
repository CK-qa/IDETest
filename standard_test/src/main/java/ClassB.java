public class ClassB extends ClassA implements Interface {

    private static String VAR_1;
    private static String var_2;


    private static void function() {
        if (VAR_1.contains("A")) {
            System.out.println("...yes...");
            if (var_2.contains("!")) {
                System.out.println("Bingo!");
            } else System.out.println("You're loser");
        }
    }

    private static final String ALPHA_NUMERIC_STRING = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    private static final String ALPHA_NUMERIC_STRING_2 = "!@#$%^&*()_+";

    private static String randomAlphaNumeric(int count, String randomSource) {
        StringBuilder builder = new StringBuilder();
        while (count-- != 0) {

            int character = (int) (Math.random() * randomSource.length());
            builder.append(randomSource.charAt(character));
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        VAR_1 = randomAlphaNumeric(5, ALPHA_NUMERIC_STRING);
        var_2 = randomAlphaNumeric(5, ALPHA_NUMERIC_STRING_2);


        if (VAR_1.equals(var_2)) {
            System.out.println("VAR_1 (" + VAR_1 + ") == var_2 (" + var_2 + ")");
        } else {
            System.out.println("VAR_1 (" + VAR_1 + ") != var_2 (" + var_2 + ")");
        }

        function();
    }

    public void function_1() {

    }
}
