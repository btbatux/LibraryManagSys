package org.librarymng.Entities;


import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "bookborrowing")
public class BookBorrowing {

    @Id
    @Column(name = "bookborrowing_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "borrowerName ")
    private String borrowerName;

    @Temporal(TemporalType.DATE)
    @Column(name ="borrowingDate ")
    private LocalDate borrowingDate;

    @Temporal(TemporalType.DATE)
    @Column(name ="retunDate")
    private LocalDate returnDate;


    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.MERGE)
    @JoinColumn(name = "book_id",referencedColumnName = "book_id")
    private Book book;

    public BookBorrowing() {
    }



    public BookBorrowing(int id, String borrowerName, LocalDate borrowingDate, LocalDate returnDate) {
        this.id = id;
        this.borrowerName = borrowerName;
        this.borrowingDate = borrowingDate;
        this.returnDate = returnDate;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBorrowerName() {
        return borrowerName;
    }

    public void setBorrowerName(String borrowerName) {
        this.borrowerName = borrowerName;
    }

    public LocalDate getBorrowingDate() {
        return borrowingDate;
    }

    public void setBorrowingDate(LocalDate borrowingDate) {
        this.borrowingDate = borrowingDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }
}
