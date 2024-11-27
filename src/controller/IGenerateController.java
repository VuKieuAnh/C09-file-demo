package controller;

import java.util.List;

public interface IGenerateController<T> {
//    danh sach
    List<T> list();
//    tao moi
    void add(T t);
}
