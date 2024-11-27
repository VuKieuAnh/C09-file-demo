package controller.book;

import model.Book;
import storage.ReadWriteBook;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BookController implements IBookController {
//luc load du lieu len -> doc tu file
    public static List<Book> books = ReadWriteBook.readBooks();

    @Override
    public List<Book> list() {
        return books;
    }

    @Override
    public void add(Book book) {
//        ghi lai file
        books.add(book);
        ReadWriteBook.writeBook(books);
    }
}
