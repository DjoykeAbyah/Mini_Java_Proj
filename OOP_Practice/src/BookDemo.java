public class BookDemo
{
    public static void main(String[] args)
    {
        Book briefVoorDeKoning = new Book ("Tonke Dragt",
                "Brief voor de koning", "Adventure", 252);

        Book mathBook = new Book("Jeff Reijans",
                "Math", "Calculus", 2401);

        Book cookBook = new Book("Nobody Important",
                "Awful Salads", "Cooking", 20);

        //member of the class, so can print it's own data
        briefVoorDeKoning.PrintBookDetails();
        mathBook.PrintBookDetails();
        cookBook.PrintBookDetails();
    }//end main

//    public static void PrintBookDetails(Book book)
//    {
//        System.out.println(book.getTitle());
//        System.out.println("by " + book.getAuthor());
//        System.out.println("has " + book.getNumPages() +
//                " pages, and its genre is " + book.getGenre());
//        System.out.println();
//    }//end PrintBookDetails

    /*
        if method not part of the Book class, method was called like this:
        PrintBookDetails(briefVoorDeKoning);
        PrintBookDetails(mathBook);
        PrintBookDetails(cookBook);
     */
}//end BookDemo class
