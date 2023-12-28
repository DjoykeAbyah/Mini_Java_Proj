import java.lang.String;
import java.util.Scanner;
import java.util.ArrayList;

public class Proj5_1_NamePermutations
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        ArrayList<String> firstNameArr = new ArrayList<>();
        ArrayList<String> lastNameArr = new ArrayList<>();
        String fullName;
        String firstName;
        String lastName;
        final int NUM_NAMES = 5;

        System.out.println("please give a first and last name separated by space");
        for (int i = 0; i < NUM_NAMES; i++)
        {
            fullName = keyboard.nextLine();
            int whereSpace = fullName.indexOf(" ");
            if (whereSpace != -1)
            {
                firstName = fullName.substring(0, whereSpace);
                firstNameArr.add(firstName);
                lastName = fullName.substring(whereSpace + 1);
                lastNameArr.add(lastName);
            }
            else
            {
                System.out.println("name not separated by space");
                return ;
            }
        }
        System.out.println();
        System.out.println("combinations are");
        System.out.println();
        for (int i = 0; i < firstNameArr.size(); i++)
        {
            for (int j = 0; j < lastNameArr.size(); j++)
                System.out.println(firstNameArr.get(i) + " " + lastNameArr.get(j));
        }
    }
}
