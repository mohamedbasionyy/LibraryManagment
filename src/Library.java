import java.util.Scanner;

public class Library {
    private String book;
    Scanner scan=new Scanner(System.in);
     public String storeBooks(){
        System.out.println("Enter the title of the Book");
        String title=scan.next();
        System.out.println("Enter the ISBN of the Book");
        String ISBN=scan.next();
        System.out.println("Enter the name of the author");
        String author =scan.next();
        System.out.println();
        return("The Book "+title+" with this ISBN: "+ISBN+" for the author "+author+" has been add.");
    }
    public String deleteBook(){
         if()
    }
}
