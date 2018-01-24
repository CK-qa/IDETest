import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;


public class TestNGTestsClass {

    @Test
    public void testNGTest() {
        System.out.println("TestNG test");
        Assert.assertEquals(1,1);
    }

    @Test
    public void testNGTestNegative() {
        System.out.println("TestNG test");

        Assert.assertEquals(1,2);
    }

    @Test
    public void testNGTestRed() {
        int i = 1/0;
        Assert.assertEquals(1,i);
    }

    @Test(expectedExceptions = ArithmeticException.class)
    public void testNGTestExpectedException() {
        int i = 1/0;
        Assert.assertEquals(1,i);
    }

    @Ignore
    @Test
    public void testNGTestIgnored() {
        int i = 1/0;
        Assert.assertEquals(1,i);
    }
}
