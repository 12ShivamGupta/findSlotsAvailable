import org.junit.Assert;
import org.junit.Test;

public class CalenderTest
{
    @Test
    public void isSlotAvailableTest_wholeDayFree()
    {
        Calender calender = new Calender();

        int[] arr = new int[24];
        int start=1, end=5;

        boolean slotAvailable = calender.isSlotAvailable(arr,start,end);

        Assert.assertTrue(slotAvailable);
    }

    @Test
    public void isSlotAvailableTest_slotNotFree()
    {
        Calender calender = new Calender();

        int[] arr = new int[25];

        int start = 1;
        int end = 3;

        for(int i=start;i<end;i++)
            arr[i] = 1;

        boolean slotAvailable = calender.isSlotAvailable(arr,start,end);

        Assert.assertFalse(slotAvailable);
    }

    @Test
    public void isSlotAvailableTest_someSlotFree()
    {
        Calender calender = new Calender();

        int[] arr = new int[25];

        int start = 1;
        int end = 3;

        boolean slotAvailable = calender.isSlotAvailable(arr,start,end);

        Assert.assertTrue(slotAvailable);
    }
}
