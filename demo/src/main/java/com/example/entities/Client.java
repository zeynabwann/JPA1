package com.example.entities;
import javax.persistence.*;
import lombok.ToString;
@Data

@ToString
@Entity
@Table(name = "user")
@EqualsAndHashCode()
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "surname", nullable = false, length = 20)
    private String surname;

    @Column(name = "prenom", nullable = false, length = 50)
    private String prenom;
    @Column(name = "telephone", nullable = false, length = 50)
    private String telephone;

}
