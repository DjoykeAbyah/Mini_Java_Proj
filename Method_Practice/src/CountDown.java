public class CountDown
{
    public static void main(String[] args)
    {
        CountDownFrom(10);
        CountUpTo(20, 40);
    }//end main

    public static void CountDownFrom(int num)
    {
        if (num >= 0)//implicit base case
        {
            System.out.println(num);
            CountDownFrom(num - 1);
        }
    }//end countDownFrom

    public static void CountUpTo(int startVal, int endVal)
    {
        if (startVal <= endVal)//implicit base case
        {
            System.out.println(startVal);
            CountUpTo(startVal + 1, endVal);
        }
    }//end countUpTo
}
