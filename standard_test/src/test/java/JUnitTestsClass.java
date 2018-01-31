import org.junit.*;
import org.junit.rules.ExpectedException;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertNotNull;

public class JUnitTestsClass {


    @Before
    public void beforeClass() {
        System.out.println("Before Method");
    }

    @After
    public void afterClass() {
        System.out.println("After Method\n");
    }

    @Test
    public void jUnitTest() {
        System.out.println("jUnitTest running");
        Assert.assertThat("Not ok", "String", containsString("String"));
    }

    @Test
    public void jUnitTestNegative() {
        System.out.println("jUnitTestNegative running");
        Assert.assertThat("Not ok", "String", containsString("String1"));
    }

    @Test
    public void jUnitRedTest() {
        System.out.println("jUnitRedTest running");
        String s = null;
        System.out.println(s.length());
    }

    @Test(expected = NullPointerException.class)
    public void jUnitTestWithExpectedException() {
        System.out.println("jUnitTestWithExpectedException running");
        String s = null;
        System.out.println(s.length());
    }

    @Ignore
    @Test
    public void jUnitTestIgnored() {
        System.out.println("jUnitTestIgnored running");
        //ignore me
    }

    @Test
    public void jUnitAssertNotNull() {
        assertNotNull(getClass().getResource("test.resources"));
    }
}
