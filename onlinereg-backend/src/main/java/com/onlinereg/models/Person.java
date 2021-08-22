package com.onlinereg.models;

public class Person {

    private String fullname;
    private String surname;
    private String telephone;

    public Person() {}
    
    public Person(String fullname, String surname, String telephone) { 
        this.fullname = fullname;
        this.surname = surname;
        this.telephone = telephone;
    }

    public String getFullname() { return fullname; }

    public String getSurname() { return surname; }

    public String getTelephone() { return telephone; }

    public void setFullname(String fullname) { this.fullname = fullname; }

    public void setSurname(String surname) { this.surname = surname; }

    public void setTelephone(String telephone) { this.telephone = telephone; }

    @Override
    public String toString() {
        return this.fullname + " " + this.surname + " " + this.telephone;
    }
}
