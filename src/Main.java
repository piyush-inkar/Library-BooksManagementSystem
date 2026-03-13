import model.Books;
import service.BookService;
import util.Inpututil;

public class Main{
    public static void main(String[]args){

        BookService service=new BookService();

while (true){

    System.out.println("\n============= Library Books Management System ==============");
    System.out.println("1.Add Book.");
    System.out.println("2.View Books.");
    System.out.println("3.Search Book.");
    System.out.println("4.Borrow Book.");
    System.out.println("5.Return Book.");
    System.out.println("6.Exit System.");

    int choose = Inpututil.getint("Choose an Option: ");
    System.out.println("------------------------------");

    switch (choose){

        case 1:
                int number = Inpututil.getint("Enter the Book ID: ");
                String title = Inpututil.getString("Enter the Title: ");
                String author = Inpututil.getString("Enter Author Name: ");

                Books books = new Books(number,title,author);
                boolean added= service.addBook(books);

            if (added){
                System.out.println("Book added successfully.");
            }
            else {
                System.out.println("This book already exist in the Library.");
            }
            break;

        case 2:
           if (!service.viewBook()){
               System.out.println("Currently there are no books in the library.");
           }
           break;

        case 3:
            int search=Inpututil.getint("Enter the Book ID: ");
            Books foundBook= service.searchBook(search);

            if (foundBook==null){
                System.out.println("Book not found!");
            }
            else {
                foundBook.displayBooks();
            }
            break;

        case 4:
            int name=Inpututil.getint("Enter the Book ID: ");
            int borrowStatus= service.borrowBook(name);

            if (borrowStatus==1){
                System.out.println("Book not found!");
            } else if (borrowStatus==2) {
                System.out.println("This book is already borrowed.");

            } else {
                System.out.println("You borrowed the book.");
            }
            break;

        case 5:
            int bookname=Inpututil.getint("Enter the Book ID: ");

            int returnBook=service.returnBook(bookname);

            if (returnBook==1){
                System.out.println("Book not found!");
            } else if (returnBook==2) {
                System.out.println("Entered book is already available in the library.");

            } else {
                System.out.println("Returned book successfully.");
            }
            break;

        case 6 :
            System.out.println("Exiting Program...");
            System.exit(0);

        default:
            System.out.println("Invalid Option Choosed!");
    }
        }
    }
}


