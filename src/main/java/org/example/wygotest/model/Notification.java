package org.example.wygotest.model;

import jakarta.persistence.*;

@Entity
@Table(name = "user")
public class Notification {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Integer id;
}
