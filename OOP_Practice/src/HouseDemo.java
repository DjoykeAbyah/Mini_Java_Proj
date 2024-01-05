public class HouseDemo
{
    public static void main(String[] args)
    {
        /*
            they each get their own copy of those variables
            when we call those methods
            the instance methods are only applied to the specific house
            because it's an instance method
            the data it's returning are instance fields
            each object gets its own copy

            these objects maintain their own specific data
            we can treat the objects as self-contained entities
            pass them to methods etc.
         */
        House myHouse = new House(2, 6, "red");
        House yourHouse = new House(3, 10, "blue");

        PrintHouseData(myHouse);
        PrintHouseData(yourHouse);
    }//end main

    public static void PrintHouseData(House Ahouse)
    {
        System.out.println("Your house is " + Ahouse.getColor() +
                " has " + Ahouse.getNumStories() + " stories and " +
                Ahouse.getNumWindows() + " windows.");
    }//end printHouseData
}//end HouseDemo
