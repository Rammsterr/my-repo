package exercises;

public class Book {
    public String title;
    public String author;
    public int pages;



    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;


    }
    public void printBook(){
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Pages: " + pages);
    }
    public void calculateReadingTime(){
        int pagesPerDay = 10;
        System.out.println("If you read 10 pages per day it will take you " + Math.ceilDiv(pages, pagesPerDay) + " days");


        }
    }

