package com.curdoperation.operation.model;

import java.util.List;

// import org.hibernate.mapping.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Reader {
@Id
int id;
String firstname;
String lastname;
@ManyToOne(cascade = CascadeType.ALL)
@JoinColumn(name="details_id")
List<Bookdetails> book;

public List<Bookdetails> getBook() {
    return book;
}
public void setBook(List<Bookdetails> book) {
    this.book = book;
}
public Reader() {
}
public Reader(int id, String firstname, String lastname) {
    this.id = id;
    this.firstname = firstname;
    this.lastname = lastname;
}
public int getId() {
    return id;
}
public void setId(int id) {
    this.id = id;
}
public String getFirstname() {
    return firstname;
}
public void setFirstname(String firstname) {
    this.firstname = firstname;
}
public String getLastname() {
    return lastname;
}
public void setLastname(String lastname) {
    this.lastname = lastname;
}
}