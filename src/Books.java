public class Books {
    private String book;
    private String author;
    private int ISBN;

    public Books(String book,String author,int ISBN){
        this.author=author;
        this.book=book;
        this.ISBN=ISBN;
    }

    public String getBook() {
        return book;
    }
    public String getAuthor() {
        return author;
    }
    public int getISBN() {
        return ISBN;
    }




}
