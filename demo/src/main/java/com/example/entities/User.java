package com.example.entities;

import java.util.List;
import javax.persistence.*;

import org.hibernate.mapping.OneToOne;
@ToString
@Entity
@Table(name = "user")
@EqualsAndHashCode()

    @Data
 @Table(name = "users")
public class User {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
 private Long id;

  @Column(login = "login", nullable = false, length = 25)
    private String login;

    @Column(password = "password", nullable = false, length = 50)
    private String password;
    @Column(role = "role", nullable = false, length = 50)
    private String role;
    @Column(statut = "statut", nullable = false, length = 50)
    private String statut;
    
     OneToOne
     Client Client

    
}
