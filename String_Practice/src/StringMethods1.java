public class StringMethods1
{
    public static void main(String[] args)
    {
        String name = "My Name";
        String name2 = "My Name";
        String name3 = "Your Name";
        String name4 = "Djoyke Reijans";

        //length property on arrays, length method on strings
        for (int i = 0; i < name.length(); i++)
            System.out.print(name.charAt(i) + " ");
        System.out.println();

        if (name.equals(name2))
            System.out.println("Names are equal");
        else
            System.out.println("Names are not equal");
        if (name.compareTo(name3) > 0)
            System.out.println("name > name3");
        else
            System.out.println("name <= name3");
    }//end main
}
