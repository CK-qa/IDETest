public class ClassA implements ParentInterface {

    int i;
    float f;
    short sh;
    long l;

    private Integer in;
    Float fl;
    Short shrt;
    Long lo;

    String s;
    String str = "String";

    public int foo() {
        return i + in;
    }


    public void method() {
        int a = 1;

        final int i = ClassB.intValue();
        int b = a + i;
        int c = b + i;
    }



}
