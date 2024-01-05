public class House
{
    //instance fields
    //fields live as long as object lives
    private int numStories;
    private int numWindows;
    private String color;

    /**
     *  methods don't have static, because these are instance methods
     *  they're called on an object
     *  they refer to a specific object not the entire class
     */
    public int getNumStories()
    {
        return numStories;
    }

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
