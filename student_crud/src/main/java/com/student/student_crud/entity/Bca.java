package com.student.student_crud.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Bca {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private int java;
    private int python;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getJava() {
        return java;
    }

    public void setJava(int java) {
        this.java = java;
    }

    public int getPython() {
        return python;
    }

    public void setPython(int python) {
        this.python = python;
    }
    public Bca() {
    }

    public Bca(long id, String name, int java, int python) {
        this.id = id;
        this.name = name;
        this.java = java;
        this.python = python;
    }


}