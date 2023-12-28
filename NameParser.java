import java.util.Scanner;

public class NameParser
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        String name;

        System.out.println("First name + Last name");
        name = keyboard.nextLine();
        int whereSpace = name.indexOf(" ");

        if (whereSpace != -1)
        {
            String lastName = name.substring(whereSpace + 1);
            String firstName = name.substring(0, whereSpace);

            firstName = firstName.toUpperCase();
            lastName = lastName.toLowerCase();
            System.out.println("firstname: " + firstName);
            System.out.println("lastname: " + lastName);
        }
        else
            System.out.println("no space found in input");
    }
}
