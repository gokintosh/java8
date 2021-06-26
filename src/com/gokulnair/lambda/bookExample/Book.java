package com.gokulnair.lambda.bookExample;

public class Book {
    private int Id;
    private String name;
    private int pages;

    @Override
    public String toString() {
        return "Book{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", pages=" + pages +
                '}';
    }

    public Book(int id, String name, int pages) {
        Id = id;
        this.name = name;
        this.pages = pages;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
}
