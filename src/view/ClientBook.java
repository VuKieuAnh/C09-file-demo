package view;

import controller.book.BookController;
import controller.book.IBookController;
import model.Book;

import java.util.Scanner;

public class ClientBook {
//    luu du lieu lai
    private static IBookController bookController = new BookController();
    public static void main(String[] args) {
//        nhap du lieu de them moi
//        Book book = getNewBook();
//        bookController.add(book);
        System.out.println(bookController.list());
    }

    private static Book getNewBook(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("moi ban nhap vao id");
        int id = scanner.nextInt();
        System.out.println("ten");
        String name = scanner.next();
        System.out.println("gia");
        int price = scanner.nextInt();
        System.out.println("tac gia");
        String author = scanner.next();
        return new Book(id, name, author, price);
    }
}
