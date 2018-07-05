import com.sun.prism.Image;

import java.net.URL;

public class ClassAImpl extends ClassA {
    public ClassAImpl(int i, float f, short sh, long l) {
        super(i, f, sh, l);
    }

    /**
     * Test
     * <b>Test</b>
     */
    public void transform() {
    }

    /**
     * some test
     *
     * @param one
     * @param a   more text
     */
    public static void method(String one, int a) {
        String two = one + "lalala";
        String three = two + "pewpew";
    }

    public void method(String one, String two) {
    }


    public void method(String one, String two, String three) throws Exception {
    }

    /**
     * Returns an Image object that can then be painted on the screen.
     * <p>
     * <p>
     * The url argument must specify an absolute {@link URL}. The name
     * argument is a specifier that is relative to the url argument.
     * <p>
     * This method always returns immediately, whether or not the
     * image exists. When this applet attempts to draw the image on
     * the screen, the data will be loaded. The graphics primitives
     * that draw the image will incrementally paint on the screen.
     *
     * @param url  an absolute URL giving the base location of the image
     * @param name the location of the image, relative to the url argument
     * @return the image at the specified URL
     * @see
     * @see Image
     */
    public Image getImage(URL url, String name) {
        return getImage(url, name);
    }

    public void test() {
        show();
        method("ololo", 1);
    }

    public static void main(String[] args) {
        method("ololo", 2);
    }

    @Override
    void show() {
        System.out.println("Child's show()");
    }
}