package com.atguigu.spring5.service;

import com.atguigu.spring5.dao.BookDao;
import com.atguigu.spring5.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "bookService")
public class BookService {
    //注入dao
    @Autowired
    private BookDao bookDao;

    //添加的方法
    public void addBook(Book book){
        bookDao.add(book);
    }
    //修改的方法
    public void updateBook(Book book){
        bookDao.updateBook(book);
    }
    //删除的方法
    public void deleteBook(String id){
        bookDao.deleteBook(id);
    }

    //查询表记录数(返回一个值)
    public int findCount(){
       return bookDao.seletCount();
    }

    //查询表记录数(返回一个对象)
    public Book findOne(String id){
        return bookDao.findBookInfo(id);
    }
    //查询表记录数(返回集合)
    public List<Book> findAll(){
        return bookDao.findAllBook();
    }
    //批量添加
    public void batchAdd(List<Object[]> batchArgs){
        bookDao.batchAddBook(batchArgs);
    }
    //批量修改
    public void batchUpdate(List<Object[]> batchArgs){
        bookDao.batchUpdateBook(batchArgs);
    }
}
