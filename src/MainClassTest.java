import org.junit.Assert;
import org.junit.Test;

public class MainClassTest
{

    @Test
    public void testGetLocalNumber()
    {
        MainClass x = new MainClass();
        int a = x.getLocalNumber();
        Assert.assertEquals("method GetLocalNumber returns number !=14", 14, a);

    }
}


