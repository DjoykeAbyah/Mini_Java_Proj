import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;


/**
 * main method, only calls runGame
 */
public class TicTacToe
{
    public static void main(String[] args)
    {
        runGame();
    }    //end main

    /**
     * runs all the methods needed for the game
     */
    public static void runGame()
    {
        String winner = "";
        String[][] gameBoard = new String[3][3];
        String xTurn = "x";
        initGameBoard(gameBoard);

        while (getWinner(gameBoard).isEmpty() && !isBoardFull(gameBoard))
        {
            printBoard(gameBoard);
            getUserInput(xTurn, gameBoard);
            xTurn = (xTurn.equals("x")) ? "o" : "x";
            if (isBoardFull(gameBoard) && winner.isEmpty())
            {
                winner = "c";
                printBoard(gameBoard);
                System.out.println("winner is " + winner);
                return ;
            }
        }
        winner = getWinner(gameBoard);
        printBoard(gameBoard);
        System.out.println("winner is " + winner);
    }//end runGame

    /**
     * initializes gameBoard array
     */
    public static void initGameBoard(String[][] gameBoard)
    {
        for (int i = 0; i < gameBoard.length; i++)
            Arrays.fill(gameBoard[i], " ");
    }// end initGameBoard

    /**
     * prints the gameBoard array
     */
    public static void printBoard(String[][] gameBoard)
    {

        for (int i = 0; i < gameBoard.length; i++)
        {
            for (int j = 0; j < gameBoard[i].length; j++)
            {
                System.out.print("|");
                System.out.print(gameBoard[i][j]);
            }
            System.out.print("|");
            System.out.println();
        }
        System.out.println();
    }// end printBoard

    /**
     * The `try` and `catch` blocks are part of exception handling
     * `try` Block:** The code inside the `try` block contains the statements that might throw an exception.
     * catch` Block:** If an exception occurs in the `try` block, the control is transferred to the `catch` block.
     * The `catch` block contains the code that handles the exception.
     * while (true)` Loop is an infinite loop, keep executing until a `break` statement is encountered.
     *
     * 1. The `try` block attempts to execute the code inside it.
     * 2. If an exception occurs (e.g., invalid input), the control moves to the `catch` block.
     * 3. The `catch` block handles the exception (e.g., prints an error message) and then goes back to the beginning of the loop.
     * 4. If no exception occurs, the `catch` block is skipped, and the `break;` statement is encountered, exiting the loop.
 */
    public static void getUserInput(String xTurn, String[][] gameBoard) {
        Scanner userInput = new Scanner(System.in);
        int row = -1;
        int column = -1;

        while (true)
        {
            try
            {
                System.out.println("It's " + xTurn + "'s turn");
                System.out.println("Please enter row and column, 0, 1, or 2, separated by space");

                String input = userInput.nextLine();
                String[] inputArray = input.split(" ");

                if (inputArray.length == 2)
                {
                    row = Integer.parseInt(inputArray[0]);
                    column = Integer.parseInt(inputArray[1]);

                    if (row >= 0 && row <= 2 && column >= 0 && column <= 2 && cellOccupied(row, column, gameBoard))
                        break; // Exit the loop if the input is valid
                    else
                        System.out.println("Invalid input. Please enter values within the range 0 to 2.");
                }
                else
                    System.out.println("Invalid input. Please enter exactly two integers separated by space.");
            }
            catch (NumberFormatException | InputMismatchException e)
            {
                System.out.println("Invalid input. Please enter valid integers separated by space.");
            }
       } gameBoard[row][column] = xTurn;
    }// end getUserInput

    /**
     * checks if array index is non space
     */
    public static boolean cellOccupied(int row, int col, String[][] gameBoard)
    {
        if (gameBoard[row][col].equals(" "))
            return true;
        return false;
    }// end cellOccupied

    /**
     * checks combinations to see if there is a winner or a tie
     */
    public static String getWinner(String[][] gameBoard)
    {
        // Check rows
        for (int i = 0; i < gameBoard.length; i++)
        {
            if ((gameBoard[i][0].equals(gameBoard[i][1]) && gameBoard[i][1].equals(gameBoard[i][2])) && !gameBoard[i][0].equals(" "))
                return gameBoard[i][0];
        }
        // Check columns
        for (int j = 0; j < gameBoard[0].length; j++)
        {
            if ((gameBoard[0][j].equals(gameBoard[1][j]) && gameBoard[1][j].equals(gameBoard[2][j])) && !gameBoard[0][j].equals(" "))
                return gameBoard[0][j];
        }
        // Check diagonals
        if ((gameBoard[0][0].equals(gameBoard[1][1]) && gameBoard[1][1].equals(gameBoard[2][2])) && !gameBoard[0][0].equals(" "))
            return gameBoard[0][0];
        if (gameBoard[0][2].equals(gameBoard[1][1]) && gameBoard[1][1].equals(gameBoard[2][0]) && !gameBoard[0][2].equals(" "))
            return gameBoard[0][2];
        return "";
    }// end getWinner

    /**
     * checks is the array is full with non space characters
     */
    public static boolean isBoardFull(String[][] gameBoard)
    {
        for (int i = 0; i < gameBoard.length; i++)
        {
            for (int j = 0; j < gameBoard[i].length; j++)
            {
                if (gameBoard[i][j].equals(" "))
                    return (false);
            }
        }
        return true;
    }// end isBoardFull
}// end class
