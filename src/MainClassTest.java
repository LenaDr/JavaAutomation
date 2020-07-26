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
}


