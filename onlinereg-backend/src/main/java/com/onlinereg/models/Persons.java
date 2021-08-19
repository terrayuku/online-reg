package com.onlinereg.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Persons {

    @Id
    @GeneratedValue
    private long id;
    private String fullname;
    private String surname;
    private String telephone;

    public Persons() { }

    public long getId() { return id; }

    public String getFullname() { return fullname; }

    public String getSurname() { return surname; }

    public String getTelephone() { return telephone; }

    public void setFullname(String fullname) { this.fullname = fullname; }

    public void setSurname(String surname) { this.surname = surname; }

    public void setTelephone(String telephone) { this.telephone = telephone; }
}
