package com.gokulnair.lambda.bookExample;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BookService {

    public List<Book>getBookSorted(){
        List<Book>books=new BookDao().getBooks();
        Collections.sort(books,(Comparator.comparing(Book::getName)));
        return books;
    }

    public static void main(String[] args) {
        System.out.println(new BookService().getBookSorted());
    }
}


//class MyComparator implements Comparator<Book>{
//
//    @Override
//    public int compare(Book o1, Book o2) {
//        return o1.getId().;
//    }
//}
