public class MethodOverloading
{
    public static void main(String[] args)
    {
        int result = getResult(5);
        System.out.println(result);

        result = getResult(5, 4);
        System.out.println(result);

        result = getResult(5,"12");
        System.out.println(result);

        System.out.println(getResult("cheese","puff"));
    }//end main

    /*
        name with parameter is the method's signature
        able to distinguish between these overloads
        they all have exactly the same name,
        they have different parameter lists

        return type is not part of the signature
        system has to know which one to call by the signature

        the compiler needs a way of distinguishing between the method calls.
        the return type, is not considered part of the method's signature
        because calling it doesn't help distinguish one call from another,
        The parameters on the other hand, do. So, when the method names are the same,
        but the parameter lists including types, number, and order of the parameters are different,
        then you can create method overloads
     */

    public static int getResult(int num)
    {
        return num * 2;
    }

    public static int getResult(int num1, int num2)
    {
        return num1 * num2;
    }

    public static int getResult(int num1, String value)
    {
        return num1 * Integer.parseInt(value);
    }

    public static String getResult(String s1, String s2)
    {
        return (s1 +  " " + s2);
    }
}
