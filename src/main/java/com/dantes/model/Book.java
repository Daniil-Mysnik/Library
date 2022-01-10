package com.dantes.model;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String title;
    String author;
    String publishing;
    String language;
    Integer publishingYear;
    String ISBN;
    Integer pagesNumber;
    Integer count;
    @ManyToMany(mappedBy = "books")
    Set<User> users;
    @OneToMany(mappedBy = "book", cascade = CascadeType.ALL, orphanRemoval = true)
    Set<BookTimeReservation> bookTimeReservation;
}
