import org.junit.Assert;
import org.junit.Test;

public class CompareNumberTest
{
    @Test
    public void checkTest_Number1LessThanNumber2()
    {
        int number1 = 1;
        int number2 = 2;

        CompareNumber compareNumber = new CompareNumber();

        Assert.assertEquals(-1,compareNumber.compare(number1,number2));
    }

    @Test
    public void checkTest_Number1EqualsNumber2()
    {
        int number1 = 2;
        int number2 = 2;

        CompareNumber compareNumber = new CompareNumber();

        Assert.assertEquals(0,compareNumber.compare(number1,number2));
    }

    @Test
    public void checkTest_Number1GreaterThanNumber2()
    {
        int number1 = 2;
        int number2 = 1;

        CompareNumber compareNumber = new CompareNumber();

        Assert.assertEquals(1,compareNumber.compare(number1,number2));
    }
}
