package com.company;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;

public class Main {
    private static Scanner input = new Scanner(System.in);
    private static SimpleDateFormat sfd = new SimpleDateFormat("dd.MM.yyyy");

    public static void main(String[] args) throws ParseException {

    }

    public static void bookLibrary() throws ParseException {

        List<Author> authorList = new ArrayList<>();
        Library lib = new Library("Library of Nasko");
        int n = Integer.parseInt(input.nextLine());

        for (int i = 0; i < n; i++) {
            String[] text = input.nextLine().split(" ");

            String title = text[0];
            String author = text[1];
            String publisher = text[2];
            Date releaseDate = sfd.parse(text[3]);
            String isbn = text[4];
            double price = Double.parseDouble(text[5]);

            Author auth = new Author(author, price);
            if (isExistingAuthor(authorList, auth) == -1) {
                authorList.add(auth);
            }
            else {
                int index = isExistingAuthor(authorList, auth);
                authorList.get(index).addMoney(price);
            }
            Book book = new Book(title, auth, publisher, isbn,price, releaseDate);
            lib.addBook(book);
        }
        String finalInput = input.nextLine();
        Date borderDate = sfd.parse(finalInput);

        //The following is for without the modification
        /*authorList = authorList.stream().sorted(comparing(Author::getMoney).reversed()
                .thenComparing(comparing(Author::getName))).collect(Collectors.toList());
        printAuthors(authorList);*/



        //The following is for after the modification
        List<Book> result = getBookTitlesAfterDate(borderDate, lib.getBooks());
        result = result.stream().sorted(comparing(Book::getReleaseDate)
                .thenComparing(comparing(Book::getTitle))).collect(Collectors.toList());

        printBooks(result);


    }

    public static int isExistingAuthor(List<Author> authors, Author author) {
        for (int i = 0; i < authors.size(); i++) {
            if (authors.get(i).getName().equals(author.getName()))
                return i;

        }

        return -1;
    }

    public static void printAuthors(List<Author> authors) {
        for (Author auth : authors) {
            System.out.printf("%s -> %.2f\n", auth.getName(), auth.getMoney());
        }
    }

    public static List<Book> getBookTitlesAfterDate(Date date, List<Book> books) {
        List<Book> res = new ArrayList<>();
        for (Book b : books) {
            if (b.getReleaseDate().after(date))
                res.add(b);
        }
        return res;
    }

    public static void printBooks(List<Book> books) {
        for (Book b : books) {
            System.out.printf("%s -> %s\n", b.getTitle(), sfd.format(b.getReleaseDate()));
        }
    }
}

class Library {
    private String name;
    List<Book> books;

    public Library(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void addBook(Book book) {
        this.getBooks().add(book);
    }
}

class Book {
    private String title;
    private String publisher;
    private String isbn;
    private double price;
    private Date releaseDate;
    private Author auth;

    public Book(String title, Author author, String publisher, String isbn, double price, Date releaseDate) {
        this.title = title;
        this.publisher = publisher;
        this.isbn = isbn;
        this.price = price;
        this.releaseDate = releaseDate;
        this.auth = new Author(author.getName(), author.getMoney());
    }

    public String getTitle() {
        return title;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getIsbn() {
        return isbn;
    }

    public double getPrice() {
        return price;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }
}

class Author {
    private String name;
    private double money;

    public Author(String name) {
        this.name = name;
        this.money = 0.0;
    }

    public Author(String name, double money) {
        this.name = name;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public double getMoney() {
        return money;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addMoney(double money) {
        this.money += money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
