package com.onlinereg.models;

public class Person {
    
    private String fullname;
    private String surname;
    private String telephone;

    public Person() { }

    public String getFullname() { return fullname; }

    public String getSurname() { return surname; }

    public String getTelephone() { return telephone; }

    public void setFullname(String fullname) { this.fullname = fullname; }

    public void setSurname(String surname) { this.surname = surname; }

    public void setTelephone(String telephone) { this.telephone = telephone; }
}
