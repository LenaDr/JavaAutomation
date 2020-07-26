import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class MainClassTest
{

    @Test
    public void testGetLocalNumber()
    {
        MainClass x = new MainClass();
        int a = x.getLocalNumber();
        Assert.assertEquals("method GetLocalNumber returns number !=14", 14, a);

    }
    @Test
    public void testGetClassNumber()
    {
        MainClass y = new MainClass();
        int b = y.getClassNumber();
        assertThat("method getClassNumber returns number < 45", b, greaterThan(45));
    }

    @Test
    public void testGetClassString()
    {
        MainClass z = new MainClass();
        String c = z.getClassString();

        assertThat("method getClassString returns string that doesn't contain substrings \"Hello\" or \"hello\" ",
                c, anyOf(containsString("Hello"), containsString("hello")));
    }
}


