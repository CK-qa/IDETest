import java.util.List;

public class ClassA implements ParentInterface {

    int i;
    float f;
    short sh;
    long l;

    private Integer in;
    Float fl;
    Short shrt;
    Long lo;

    public String sss() {
        return null;
    }

    @Override
    public int aaa() {
        return 0;
    }

    String s = " ";
    String str = "./*String";

    public int foo() {
        return i + in;
    }

    void show() {
        System.out.println("Parent's show()");
    }

    public void method() {
        int a = 1;
        final int i = ClassBi.intValue();
        int b = a + i;
        int c = b + i;
    }

    public ClassA(int i, float f, short sh, long l) {
        this.i = i;
        this.f = f;
        this.sh = sh;
        this.l = l;
    }

    public Short getShrt() {
        show();
        return shrt;
    }

    public void setShrta(Float fl) {
        this.fl = fl;

    }

    public void ttt(List list) {

    }

    public void methWithParams(int integer, int integer2, String string, Object object, boolean boo, Integer intgr) {

    }

}