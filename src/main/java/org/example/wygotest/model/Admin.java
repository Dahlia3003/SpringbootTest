package org.example.wygotest.model;

import jakarta.persistence.*;

@Entity
@Table(name = "admin")
public class Admin extends Account {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Integer id;

    private Integer addtribute1;
}
