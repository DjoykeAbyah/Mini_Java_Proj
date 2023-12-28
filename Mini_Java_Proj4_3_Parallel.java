import java.util.ArrayList;
import java.util.Scanner;

public class Mini_Java_Proj4_3_Parallel
{
    public static void main(String[] args)
    {
        ArrayList<String> nameArray = new ArrayList<>();
        ArrayList<Integer> ageArray = new ArrayList<>();
        Scanner keyboard = new Scanner(System.in);
        String name;
        int age;
        int inputNum = 0;

        while (inputNum < 5)
        {
            System.out.println("name is");
            name = keyboard.next();
            nameArray.add(name);
            System.out.println("age is");
            age = keyboard.nextInt();
            ageArray.add(age);
            inputNum++;
        }
        for (int i = 0; i < nameArray.size(); i++)
        {
            System.out.println(nameArray.get(i) + " is " + ageArray.get(i) + " years old");
            System.out.println();
        }

    }
}
