package core_labels;

import java.lang.annotation.Annotation;

@AnnotationToTest(
        name = "Vika",
        purpose = ""
)

public class Calcs implements FInterface, AnnotationToTest {

    private static Calcs calcs = new Calcs();

    public static void main(String[] args) {
        MClass.oddNumbers();
        MClass.power();
        calcs.anyCalc();
        calcs.doSomeOtherWork();
        test(1,2,3, "4", true);
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

    private static void test(int a, int b, int c, String str, boolean bb) {
        System.out.println(a + b + c + str + bb);
    }



}
