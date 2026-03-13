package service;

import model.Books;

import java.util.HashMap;
import java.util.Map;

public class BookService {
    private Map<Integer, Books> BOOKS=new HashMap<>();

    public boolean addBook(Books books){
     if (BOOKS.containsKey(books.getBook_ID())){
         return false;
     }
     BOOKS.put(books.getBook_ID(), books);
     return true;
    }

    public boolean viewBook() {
        if (BOOKS.isEmpty()) {
            return false;
        }
        for (Books b : BOOKS.values()) {
            b.displayBooks();
        }
        return true;
    }

    public Books searchBook(int book_id){
        return BOOKS.get(book_id);
    }

    public int borrowBook(int book_id){
        Books books=BOOKS.get(book_id);

        if (books==null){
            return 1;
        }
        if (books.isBorrowed()){
            return 2;
        }
        books.setBorrowed(true);
        return 3;
    }

    public int returnBook(int book_id){
        Books books=BOOKS.get(book_id);

        if (books==null){
            return 1;
        }
        if (!books.isBorrowed()){
            return 2;
        }
        books.setBorrowed(false);
        return 3;
    }
}