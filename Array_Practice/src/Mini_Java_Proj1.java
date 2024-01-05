import java.util.ArrayList;
import java.util.Scanner;

public class Mini_Java_Proj1
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        ArrayList<Double> myList = new ArrayList<>();
        double input;
        boolean minus = false;

        while(!minus)
        {
            System.out.println("please give number above 0");
            input = keyboard.nextDouble();
            if (input < 0)
                minus = true;
            else
                myList.add(input);
        }
        for (int i = myList.size() - 1; i >= 0; i--)
            System.out.println(myList.get(i));
    }
}
