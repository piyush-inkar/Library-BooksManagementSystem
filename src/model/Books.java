package model;

public class Books {
    private int book_ID;
    private String title;
    private String author;
    boolean isBorrowed;

    public Books(int book_ID, String title, String author){
        this.book_ID=book_ID;
        this.title=title;
        this.author=author;
        this.isBorrowed=false;
    }
            // Getters
    public int getBook_ID() {
        return book_ID;
    }
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }


    public void displayBooks(){
        System.out.println("Book ID: "+book_ID);
        System.out.println("Book Title: "+title);
        System.out.println("Author: "+author);
        if (isBorrowed){
            System.out.println("Status: Already borrowed.");
        }else {
            System.out.println("Status: Available.");
        }
        System.out.println("------------------------------\n");
    }
}
