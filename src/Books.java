public class Books {
    private String book;
    private String author;
    private int ISBN;
    private boolean isAvaliable;

    public Books(){
        this.author=author;
        this.book=book;
        this.ISBN=ISBN;
        this.isAvaliable=isAvaliable;
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

    public boolean isAvaliable() {
        return isAvaliable;
    }

    public void setAvaliable(boolean avaliable) {
        isAvaliable = avaliable;
    }
}
