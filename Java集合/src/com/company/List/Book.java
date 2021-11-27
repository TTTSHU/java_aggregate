package com.company.List;

public class Book {
    private String BookName;
    private Double Price;
    private String Author;

    public Book(String bookName, Double price, String author) {
        BookName = bookName;
        Price = price;
        Author = author;
    }

    public String getBookName() {
        return BookName;
    }

    public void setBookName(String bookName) {
        BookName = bookName;
    }

    public Double getPrice() {
        return Price;
    }

    public void setPrice(Double price) {
        Price = price;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    @Override
    public String toString() {
        return "书名：" + BookName + "价格=" + Price + " 作者='" + Author;
    }
}
