import org.junit.*;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertNotNull;

public class JUnitTestsClass {


    @Before
    public void beforeClass() {
        System.out.println("This should be printed Before Method execution");
    }

    @After
    public void afterClass() {
        System.out.println("This should be printed After Method execution\n");
    }

    @Test
    public void jUnitTest() {
        System.out.println("jUnitTest running");
        System.out.println("master");
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

    @Test
    public void testProperties() {
        try {
            Properties prop = new Properties();
            InputStream is = JUnitTestsClass.class.getResourceAsStream("application.properties");
            prop.load(is);
            Assert.assertEquals(prop.getProperty("propertyName"), "propertyValue");
            Assert.assertEquals(prop.getProperty("anotherPropertyName"), "anotherPropertyValue");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}