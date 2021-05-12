package com.hstc.dao;


import com.hstc.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookMapper {

    //增加一个Book
    int addBook(Books book);

    //根据id删除一个Book
    int deleteBookById(@Param("bookId") int id);

    //更新Book
    int updateBook(Books books);

    //根据id查询,返回一个Book
    Books queryBookById(@Param("bookId") int id);

    //查询全部Book,返回list集合
    List<Books> queryAllBook();

    //根据名字查询
    Books queryBookByName(@Param("bookName") String bookName);
}
