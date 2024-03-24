package org.example.wygotest.model;

import jakarta.persistence.*;

import java.util.Date;
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Integer id;
    private String username;
//    private String password;
//    private String name;
//    private String email;
//    private Date registerDate;
}

