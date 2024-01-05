import java.util.ArrayList;
import java.util.Random;

public class Proj6_1_SumOfElements
{
    public static void main(String[] args)
    {
        ArrayList<Integer> numArr = new ArrayList<>();
        fillArr(numArr, 5);
        printArr(numArr);
        sumElements(numArr);
    }//end main

    public static void fillArr(ArrayList<Integer> numArr, int length)
    {
        Random rand = new Random();
        for (int i = 0; i < length; i++)
            numArr.add(i, rand.nextInt(100));
    }

    public static void printArr(ArrayList<Integer> numArr)
    {
        for (int i = 0; i < numArr.size(); i++)
            System.out.print(numArr.get(i) + " ");
    }

    public static void sumElements(ArrayList<Integer> listArr)
    {
        int result = 0;

        for (int i = 0; i < listArr.size(); i++)
            result += listArr.get(i);
        System.out.println(" sum = " + result);
    }
}
