package com.dantes.model;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "\"user\"")
@Inheritance(strategy = InheritanceType.JOINED)
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String firstName;
    String lastName;
    String patronymic;
    String login;
    String password;
    String phone;
    String email;
    String documentNumber;
    @ManyToMany
    @JoinTable(name = "users_books",
               joinColumns = {@JoinColumn(name = "fk_user")},
               inverseJoinColumns = {@JoinColumn(name = "fk_book")})
    Set<Book> books;
}
