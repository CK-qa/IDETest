import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.testng.annotations.Test;


public class CodeClassTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void bar() {
        Assert.assertNotNull(CodeClass.bar("pew"));
    }
}