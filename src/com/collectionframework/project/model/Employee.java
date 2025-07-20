package com.collectionframework.project.model;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private  int id;
    private  String name;
    private  String address;
    private  double sallary;
    private List<String> listOfContact;
    private List<String> listOfBook;

    public Employee(int id, String name, String address, double sallary, List<String> listOfContact, List<String> listOfBook) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.sallary = sallary;
        this.listOfContact = listOfContact;
        this.listOfBook = listOfBook;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getSallary() {
        return sallary;
    }

    public void setSallary(double sallary) {
        this.sallary = sallary;
    }

    public List<String> getListOfContact() {
        return listOfContact;
    }

    public void setListOfContact(List<String> listOfContact) {
        this.listOfContact = listOfContact;
    }

    public List<String> getListOfBook() {
        return listOfBook;
    }

    public void setListOfBook(List<String> listOfBook) {
        this.listOfBook = listOfBook;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", sallary=" + sallary +
                ", listOfContact=" + listOfContact +
                ", listOfBook=" + listOfBook +
                '}';
    }
}
