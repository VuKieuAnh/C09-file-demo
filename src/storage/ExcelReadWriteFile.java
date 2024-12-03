package storage;

import model.Book;

import java.util.Collections;
import java.util.List;

public class ExcelReadWriteFile implements IReadWriteFile {
//    mo xem code ben cu viet the nao? tra ve cai gi -> viet cho dung

    @Override
    public List<Book> readBooks() {
        return Collections.emptyList();
    }

    @Override
    public void writeBook(List<Book> books) {

    }
}
