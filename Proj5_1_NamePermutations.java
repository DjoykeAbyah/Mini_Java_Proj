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
        int names = 0;
        int iter = 0;

        System.out.println("please give a first and last name separated by space");
        while (names < 5)
        {
            fullName = keyboard.nextLine();
            int whereSpace = fullName.indexOf(" ");
            if (whereSpace != -1)
            {
                firstName = fullName.substring(0, whereSpace);
                firstNameArr.add(firstName);
                lastName = fullName.substring(whereSpace + 1);
                lastNameArr.add(lastName);
                names++;
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
        while (names > 0)
        {
            if (iter == (firstNameArr.size()))
            {
                iter = 0;
                names--;
            }
            if (names > 0)
            {
                System.out.println(firstNameArr.get(names - 1) + " " + lastNameArr.get(iter));
                iter++;
            }
        }
    }
}
