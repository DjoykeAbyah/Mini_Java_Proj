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

    /*
        has to be static so can be called directly from main
     */
    public static void PrintHouseData(House house)
    {
        System.out.println("The house is " + house.getColor() +
                "\nit has " + house.getNumStories() + " stories" +
                "\nit has " + house.getNumWindows() + " windows.\n");
    }//end printHouseData
}//end HouseDemo
