package com.gokulnair.lambda.bookExample;


import java.util.ArrayList;
import java.util.List;

public class BookDao {

    public List<Book>getBooks(){
        List<Book>books=new ArrayList<>();

        books.add(new Book(101,"gokuls autobiography",400));
        books.add(new Book(102,"rahuls autobiography",500));
        books.add(new Book(103,"kannans autobiography",600));
        books.add(new Book(105,"Sameers autobiography",800));

        return books;
    }
}
