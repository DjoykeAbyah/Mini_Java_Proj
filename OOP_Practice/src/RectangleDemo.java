public class RectangleDemo
{
    public static void main(String[] args)
    {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(5, 10);

        System.out.println(Rectangle.getNumRectangles());

        Rectangle r3; //declared variable capable of holding the address but not created yet

        System.out.println("After r3 declared " + Rectangle.getNumRectangles());

        r3 = new Rectangle(2.5, 4);

        System.out.println("After r3 instantiated " + Rectangle.getNumRectangles());
        System.out.println(r1.area());
        System.out.println(r2.area());
        System.out.println(r3.area());
        System.out.println();
        System.out.println(r1.getPerimeter());
        System.out.println(r2.getPerimeter());
        System.out.println(r3.getPerimeter());
    }// end main
}
