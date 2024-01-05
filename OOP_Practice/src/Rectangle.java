public class Rectangle
{
    private double length;
    private double width;
    /*
        static exists even when no objects of Rectangle exist
        shared by all Rectangle objects if exist
     */
    private static int numRectangles;

    /*
        When inside a class and want to refer to its instance variables or methods,
        use `this` keyword.
        When calling a constructor from another constructor,
        use `this` followed by parentheses and the arguments,
        without specifying the name of the constructor.

        This syntax is to make it clear that you are calling another constructor of the same class,
        not invoking a method. `this(1.0, 1.0);`.

        This design choice helps to distinguish between method calls
        and constructor invocations and makes the code more readable and consistent.
     */
    public Rectangle()
    {
        this(1.0, 1.0);
    }// no arg constructor

    public Rectangle(double length, double width)
    {
        this.length = length;
        this.width = width;
        numRectangles++; //increase everytime constructor is called
    }// end constructor

    //getters and setters
    public double getLength()
    {
        return length;
    }

    public double getWidth()
    {
        return width;
    }

    public void setLength(double length)
    {
        this.length = length;
    }

    public void setWidth(double width)
    {
        this.width = width;
    }

    public double area()
    {
        return length * width;
    }

    public double getPerimeter()
    {
        return (2 * length) + (2 * width);
    }

    public static int getNumRectangles()
    {
        return numRectangles;
    }

}
