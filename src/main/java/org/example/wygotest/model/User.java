package org.example.wygotest.model;

import jakarta.persistence.*;

import java.util.Date;

import java.util.List;

@Entity
@Table(name = "user")
public class User extends Account {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Integer id;

    private Date birth;
    private String hometown;
    @Lob
    @Basic(fetch = FetchType.LAZY)
    private byte[] avatar;

    private String gender;
    private String bio;
    @OneToMany
    private List<User> favorList;
    @OneToMany
    private List<User> disfavorList;
    @OneToMany
    private List<User> befavoredList;
    @OneToMany
    private List<User> bedisfavoredList;
    @OneToMany
    private List<Notification> notificationList;
    private Boolean available;
}

