public class ClassBi extends ClassA implements Interface_I {

    static String one;
    static String two;
    static String moveDown;

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

    public void function_2() {

    }

    public static String getOne() {
        return one;
    }



    /*
     * pre: none
     * post: returns a String with base10Num in base 2
     */
    public static String toBinary(int base10Num) {
        boolean isNeg = base10Num < 0;
        base10Num = Math.abs(base10Num);
        String result = "";

        while (base10Num > 1) {
            result = (base10Num % 2) + result;
            base10Num /= 2;
        }
        assert base10Num == 0 || base10Num == 1 : "value is not <= 1: " + base10Num;

        result = base10Num + result;
        assert all0sAnd1s(result);

        if (isNeg)
            result = "-" + result;
        return result;
    }

    /*
     * pre: cal != null
     * post: return true if val consists only of characters 1 and 0, false otherwise
     */
    public static boolean all0sAnd1s(String val) {
        assert val != null : "Failed precondition all0sAnd1s. parameter cannot be null";
        boolean all = true;
        int i = 0;
        char c;

        while (all && i < val.length()) {
            c = val.charAt(i);
            all = c == '0' || c == '1';
            i++;
        }
        return all;
    }


    public class Dummy {
        void caller(String someString, int number) {
            toComplete(ClassBi.this.toString(), number);
        }

        void toComplete(String someString, int number) {
        }
    }

    volatile boolean foo = true;

    public boolean hasInvalidResults() {
        return (foo || false);
    }

    public void whileIndent() {
        while (foo) {
        }
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    void show() {
        super.show();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
