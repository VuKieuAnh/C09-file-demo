package storage;

import model.Book;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadWriteBook implements IReadWriteFile {

    private ReadWriteBook() {
    }
    private static ReadWriteBook instance;
    public static ReadWriteBook getInstance() {
        if (instance == null) {
            instance = new ReadWriteBook();
        }
        return instance;
    }

    //   ghi file
    public void writeBook(List<Book> books) {
        File file = new File("books.txt");
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
            oos.writeObject(books);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
//    doc file
    public List<Book> readBooks() {
        File file = new File("books.txt");
        List<Book> books = new ArrayList<>();
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
            books = (List<Book>) ois.readObject();
            return books;
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

//    public static void main(String[] args) {
//        List<Book> books = readBooks();
//        System.out.println(books);
//    }
}
