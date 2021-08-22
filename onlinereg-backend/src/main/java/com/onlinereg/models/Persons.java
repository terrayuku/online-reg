package com.onlinereg.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Persons {

    @Id
    // @GeneratedValue(strategy = GenerationType.IDENTITY)
    @SequenceGenerator(name="identifier", sequenceName="mytable_id_seq", allocationSize=1)  
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="identifier")
    private long id;
    private String fullname;
    private String surname;
    private String telephone;

    public Persons() { }

    public Persons(String fullname, String surname, String telephone) { 
        this.fullname = fullname;
        this.surname = surname;
        this.telephone = telephone;
    }

    public long getId() { return id; }

    public String getFullname() { return fullname; }

    public String getSurname() { return surname; }

    public String getTelephone() { return telephone; }

    public void setId(long id) { this.id = id; }

    public void setFullname(String fullname) { this.fullname = fullname; }

    public void setSurname(String surname) { this.surname = surname; }

    public void setTelephone(String telephone) { this.telephone = telephone; }
}
