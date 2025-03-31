public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to our library!");

        Books book1=new Books();

        System.out.println(book1.getBook());
        System.out.println(book1.getBook());
        System.out.println(book1.getISBN());


        Library newBook1 =new Library();
        System.out.println(newBook1.storeBooks());
        System.out.println(newBook1.deleteBook(50));


    }
}