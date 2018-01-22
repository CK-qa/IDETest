import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;

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
}
