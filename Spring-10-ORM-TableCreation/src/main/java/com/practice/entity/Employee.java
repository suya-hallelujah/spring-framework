package com.practice.entity;

import jdk.jfr.Name;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
//@Table (name="color")
public class Employee {

    @Id
    private int id;
    private String name;

}
