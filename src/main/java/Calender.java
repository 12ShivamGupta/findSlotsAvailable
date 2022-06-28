public class Calender
{
    public boolean isSlotAvailable(int[] time, int start, int end)
    {
        boolean isAvailable = true;

        for (int j = start; j < end; j++)
        {
            if (time[j] == 1)
            {
                isAvailable = false;
                break;
            }
        }
        return isAvailable;
    }
}
