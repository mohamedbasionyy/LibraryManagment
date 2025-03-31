import java.util.Scanner;
public class Library {
    //private String book;
    private int ISBN;
    private String author;
    private String title;
    Scanner scan=new Scanner(System.in);
     public String storeBooks(/*int ISBN,String title,String author*/){
         this.ISBN=ISBN;
         this.title=title;
         this.author=author;
        System.out.println("Enter the title of the Book");
        title=scan.next();
        System.out.println("Enter the ISBN of the Book");
        ISBN=scan.nextInt();
        System.out.println("Enter the name of the author");
        author =scan.next();
        System.out.println();
        return("The Book: "+title+" with this ISBN: "+ISBN+" for the author "+author+" has been added.");
    }
    public String deleteBook(int ISBN){
         this.ISBN=ISBN;
        System.out.println("Enter the ISBN of the Book");
        ISBN=scan.nextInt();
        return (" The book with this ISBN: "+ISBN+" has been deleted");
    }
    public String show(int ISBN,String title,String author){
        this.ISBN=ISBN;
        this.title=title;
        this.author=author;
         return ISBN+title+author;
    }

}
