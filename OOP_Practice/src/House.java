public class House
{
    /*
        instance fields
        fields live as long as object lives
     */
    private int numStories;
    private int numWindows;
    private String color;

    /*
        constructor have the same name as the class
        if you don't write one you get one without args is default constructor.
    */

    //no arg constructor
    public House()
    {
        numStories = 1;
        numWindows = 4;
        color = "grey";
    }// end ctor

    //parameterized constructor
    public House (int numStories, int numWindows, String color)
    {
        this.numStories = numStories;
        this.numWindows = numWindows;
        this.color = color;
    }// end param ctor

    /*
        methods don't have static, because these are instance methods
        they're called on an object
        they refer to a specific object not the entire class
     */

    //accessors
    public int getNumStories()
    {
        return numStories;
    }

    //mutators
    public void setNumStories(int numStories)
    {
        //this keyword overcomes name shadowing
        this.numStories = numStories;
    }

    public int getNumWindows()
    {
        return numWindows;
    }

    public void setNumWindows(int numWindows)
    {
        this.numWindows = numWindows;
    }

    public String getColor()
    {
        return color;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

}//End House
