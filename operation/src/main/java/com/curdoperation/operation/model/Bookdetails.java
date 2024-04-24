package com.curdoperation.operation.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
@Entity
public class Bookdetails {
    @Id
    private int book_id;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="reader_id")
    List<Reader> reader;
    
    public List<Reader> getReader() {
        return reader;
    }
    public void setReader(List<Reader> reader) {
        this.reader = reader;
    }
    
    public int getBook_id() {
        return book_id;
    }
    public void setBook_id(int book_id) {
        this.book_id = book_id;
    }
  
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public double getRating() {
        return rating;
    }
    public void setRating(double rating) {
        this.rating = rating;
    }
    private String title,description,author;
    private double rating;
    public Bookdetails(int book_id,  String title, String description, String author, double rating) {
        this.book_id = book_id;
        this.title = title;
        this.description = description;
        this.author = author;
        this.rating = rating;
    }
    public Bookdetails()
    {

    }
}
