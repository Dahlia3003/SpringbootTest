package org.example.wygotest.model;

import jakarta.persistence.*;

@Entity
@Table(name = "test")
public class Test {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Integer id;

    private Integer addtribute1;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAddtribute1() {
        return addtribute1;
    }

    public void setAddtribute1(Integer addtribute1) {
        this.addtribute1 = addtribute1;
    }
}
