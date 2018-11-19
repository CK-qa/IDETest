package core_labels;

import java.lang.annotation.Annotation;
import java.util.Scanner;

import static core_labels.MClass.power;


@SuppressWarnings("ALL")
@AnnotationToTest(
        name = "Vika",
        purpose = ""
)

public class Calcs implements FInterface, AnnotationToTest {

    /**
     * Shortcut method for EntryDto items. This method will fetch the id from {@code item} and pass it to
     * {@link #test2(Object, Object, Object, Object, Object)}. Make sure the dto item returns a non-null id.
     */


    @Override
    public void doSomeOtherWork() {
        do {
            System.out.println();
        } while (true);
    }

    private static void oddNumbers() {

        Calcs calcs = new Calcs();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter some number till which you want to get odd numbers:\t");
        int num = scanner.nextInt();
        int var;

        for (var = 0; var <= num; var++) {
            if (var % 2 != 0) {
                System.out.print(var + " ");
            }
        }
        System.out.println();
    }

    private static Calcs calcs = new Calcs();

    private static int metgrfghod(int a) {
        return a + a;
    }

    public static void main(String[] args) {
        oddNumbers();
        power();
        calcs.anyCalc();
        calcs.doSomeOtherWork();
    }

    @Override
    public void anyCalc() {
        System.out.println(Math.log10(100));
    }

    /**
     * @param a is just int
     * @return sum of two a's
     */


    @Override
    public Class<? extends Annotation> annotationType() {
        return null;
    }


    @Override
    public String name() {
        return null;
    }

    @Override
    public String purpose() {
        return null;
    }

    public void pew() {
        pewpewTest("15");
    }

    private String pewpewTest(String s) {
        return s;
    }


}
