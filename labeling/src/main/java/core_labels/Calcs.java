package core_labels;

import java.lang.annotation.Annotation;
import java.math.BigDecimal;
import java.util.Scanner;

@AnnotationToTest(
        name = "Vika",
        purpose = ""
)

public class Calcs implements FInterface, AnnotationToTest {

    private static void oddNumbers() {

        Calcs calcs = new Calcs();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number till which you wanna get odd numbers: ");
        int num = scanner.nextInt();
        int var;

        for (var = 0; var <= num; var++) {
            if (var%2 != 0) {
                System.out.print(var + " ");
            }
        }
        System.out.println();
    }

    private static int method(int a) {
        return a + a;
    }

    private static void power() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        Integer num = scanner.nextInt();
        System.out.println("Enter a power of the number: ");
        Integer pow = scanner.nextInt();

        System.out.println(BigDecimal.valueOf(Math.pow(num, pow)));
    }

    private static Calcs calcs = new Calcs();

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

    @Override
    public String name() {
        return null;
    }

    @Override
    public String purpose() {
        return null;
    }

    @Override
    public Class<? extends Annotation> annotationType() {
        return null;
    }

    private static void sort() {

    }
}
