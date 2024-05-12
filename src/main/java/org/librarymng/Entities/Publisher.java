package org.librarymng.Entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "publisher")
public class Publisher {

    @Id
    @Column(name = "publisher_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "establishmentYear ")
    private LocalDate establishmentYear;

    @Column(name = "address")
    private String address;


    @OneToMany(mappedBy = "publisher",fetch = FetchType.LAZY,cascade = CascadeType.REMOVE)
    private List<Book> bookList;




    public Publisher() {
    }

    public Publisher(int id, String name, LocalDate establishmentYear, String address) {
        this.id = id;
        this.name = name;
        this.establishmentYear = establishmentYear;
        this.address = address;
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getEstablishmentYear() {
        return establishmentYear;
    }

    public void setEstablishmentYear(LocalDate establishmentYear) {
        this.establishmentYear = establishmentYear;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
