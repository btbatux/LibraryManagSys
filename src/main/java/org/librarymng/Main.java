package org.librarymng;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import org.librarymng.Entities.Author;
import org.librarymng.Entities.Book;
import org.librarymng.Entities.Category;
import org.librarymng.Entities.Publisher;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("library");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        EntityTransaction entityTransaction = entityManager.getTransaction();

        entityTransaction.begin();

        // Author Adding
        Author author = new Author();
        author.setName("Test Yazar Ismi");
        author.setBirthDate(LocalDate.of(1997,6,6));
        author.setCountry("TR");
        entityManager.persist(author);

        Publisher publisher = new Publisher();
        publisher.setAddress("aaabbbccc");
        publisher.setName("BTBATU");
        publisher.setEstablishmentYear(LocalDate.of(1997,6,6));
        entityManager.persist(publisher);

        Book book = new Book();
        book.setName("Kitap ismi");
        book.setStock(122);
        book.setAuthor(author);
        book.setPublisher(publisher);
        book.setPublicationYear(LocalDate.of(1997,6,6));
        entityManager.persist(book);

        Category category = new Category();
        category.setName("Korku");
        category.setDescription("Desc Test");
        List<Book> bookList = new ArrayList<>();
        bookList.add(book);
        category.setBookList(bookList);
        entityManager.persist(category);


        entityTransaction.commit();

    }
}