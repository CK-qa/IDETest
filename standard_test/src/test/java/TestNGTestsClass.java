import org.testng.Assert;
import org.testng.annotations.*;


public class TestNGTestsClass {

    @BeforeClass
    void beforeClass() {
        System.out.println("Before Class");
    }

    @AfterClass
    void afterClass() {
        System.out.println("After Class");
    }

    @AfterMethod
    void afterMethod() {
        System.out.println("After method");
    }

    @BeforeMethod
    void beforeMethod() {
        System.out.println("Before method");
    }

    @Test
    public void testNGTest() {
        System.out.println("testNGTest running");
        Assert.assertEquals(1,1);
    }

    @Test
    public void testNGTestNegative() {
        System.out.println("testNGTestNegative running");
        Assert.assertEquals(1,2);
    }

    @Test
    public void testNGTestRed() {
        System.out.println("testNGTestRed running");
        int i = 1/0;
        Assert.assertEquals(i, 1);
    }

    @Test(expectedExceptions = ArithmeticException.class)
    public void testNGTestExpectedException() {
        System.out.println("testNGTestExpectedException running");
        int i = 1/0;
        Assert.assertEquals(1,i);
    }

    @Ignore
    @Test
    public void testNGTestIgnored() {
        System.out.println("testNGTestIgnored running");
        int i = 1/0;
        Assert.assertEquals(1,i);
    }
}