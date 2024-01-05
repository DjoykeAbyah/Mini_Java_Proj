public class MethodsDemo
{
    public static void main(String[] args)
    {
        printHello();
        printNumber(10);
        int result = giveMe10();
        System.out.println(result);

        result = addThese(3, 5);
        System.out.println(result);

        System.out.println(squared(5.5));
    }//end main

    //void, parameterless method
    public static void printHello()
    {
        System.out.println("Hello there");
    }//end printHello

    //void, parametrized method
    public static void printNumber(int a)
    {
        System.out.println("The number is " + a);
    }// end printNumber

    //value-returning, parameterless method
    public static int giveMe10()
    {
        return (10);
    }//end giveMe10

    //value-returning, parameterized method
    public static int addThese(int num1, int num2)
    {
        return num1 + num2;
    }// end addThese

    public static double squared(double a)
    {
        return (a *= a);
    }//end squared
}
