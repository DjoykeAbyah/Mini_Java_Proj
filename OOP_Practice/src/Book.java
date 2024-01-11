/*
    Book
    -----------------------------
    - author:String
    - title:String
    - genre:String
    - numPages:int
    -----------------------------
    + Book(author:String, title:String, genre:String, numPages:int)
    + getAuthor() : String
    + getTitle() : String
    + getGenre() : String
    + getNumPages() : int
 */

public class Book
{
    private String author;
    private String title;
    private String genre;
    private int numPages;

    public Book(String author, String title, String genre, int numPages)
    {
        this.author = author;
        this.title = title;
        this.genre = genre;
        this.numPages = numPages;
    }// end constructor

    public String getAuthor()
    {
        return author;
    }

    public String getTitle()
    {
        return title;
    }

    public String getGenre()
    {
        return genre;
    }

    public int getNumPages()
    {
        return numPages;
    }
    public void PrintBookDetails()//it's not static
    {
        System.out.println(title);//can just use the private data
        System.out.println("by " + author);//don't need get because we're in the object
        System.out.println("has " + numPages +
                " pages, and its genre is " + genre);
        System.out.println();
    }//end PrintBookDetails

}//end book class
