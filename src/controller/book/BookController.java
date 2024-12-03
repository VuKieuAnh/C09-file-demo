package controller.book;

import model.Book;
import storage.ExcelReadWriteFile;
import storage.IReadWriteFile;
import storage.ReadWriteBook;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BookController implements IBookController {
    static IReadWriteFile iReadWriteFile = ReadWriteBook.getInstance();
//luc load du lieu len -> doc tu file
    public static List<Book> books = iReadWriteFile.readBooks();

    @Override
    public List<Book> list() {
        return books;
    }

    @Override
    public void add(Book book) {
//        ghi lai file
        books.add(book);
        iReadWriteFile.writeBook(books);
    }
}
