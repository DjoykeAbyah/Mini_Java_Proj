public class StringMethods2
{
    public static void main(String[] args)
    {
        String myName = "Djoyke Reijans";
        String upper = myName.toUpperCase();
        String lower = myName.toLowerCase();
        int whereIs = myName.indexOf("i");
        String lastName = myName.substring(7);

        System.out.println("upper is " + upper);
        System.out.println("lower is " + lower);
        System.out.println("i is at index " + whereIs);
        System.out.println("last name is " + lastName);

    }//end main
}
