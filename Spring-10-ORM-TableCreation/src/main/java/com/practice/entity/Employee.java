package com.practice.entity;

import jdk.jfr.Name;

import javax.persistence.*;

@Entity
//@Table (name="color")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

}
