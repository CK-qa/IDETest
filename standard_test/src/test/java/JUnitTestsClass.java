import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertNotNull;

public class JUnitTestsClass {

    @Test
    public void jUnitTest() {
        System.out.println("Test Junit");
        Assert.assertThat("Not ok", "String", containsString("String"));
    }

    @Test
    public void jUnitTestNegative() {
        System.out.println("Test Junit");
        Assert.assertThat("Not ok", "String", containsString("String1"));
    }

    @Test
    public void jUnitRedTest() {
        String s = null;
        System.out.println(s.length());
    }

    @Test(expected = NullPointerException.class)
    public void jUnitTestWithExpectedException() {
        String s = null;
        System.out.println(s.length());
    }

    @Ignore
    @Test
    public void jUnitTestIgnored() {
        //ignore me
    }

    @Test
    public void jUnitAssertNotNull() {
        assertNotNull(getClass().getResource("test.resources"));
    }
}
