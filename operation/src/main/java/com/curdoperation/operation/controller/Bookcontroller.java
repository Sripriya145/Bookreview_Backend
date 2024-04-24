package com.curdoperation.operation.controller;

import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.curdoperation.operation.Repo.BookRepo;
import com.curdoperation.operation.model.Bookdetails;
import com.curdoperation.operation.service.BookreviewService;


@RestController
public class Bookcontroller {
    @Autowired
    BookreviewService review;
    @Autowired
    BookRepo repo;
    //using controller class
    @PostMapping(path = "/insertdetails")
    public Bookdetails insertdata(@RequestBody Bookdetails details)
    {
        return review.insertBookdetails(details);
    }
    @GetMapping("/insertdetails/bookdetails/{book_id}")
    public Optional<Bookdetails>PrintBookDetails(@PathVariable int book_id)
    {        
        return review.getParticularBookDetails(book_id);
    }
    @GetMapping("/insertdetails/bookdetails")
    public List<Bookdetails> GetAllBookdetail()
    {
       return review.GetAllBookdetails();
    }
    @DeleteMapping("/insertdetails/bookdetails/{book_id}")
    public ResponseEntity<Void> deleteIdValue(@PathVariable int book_id) {
        repo.deleteById(book_id);
        return ResponseEntity.noContent().build();
    }
    @PutMapping("/insertdetails/bookdetails")
    public Bookdetails update_the_details(@RequestBody Bookdetails details)
    {
        return review.updateBookdetails(details);
    }
    //jpql custom query
    @GetMapping("/insertdetails/bookdetails/{author}/{title}")
    public List<Bookdetails> findbyAuthorandTitle(@PathVariable String author,@PathVariable String title)
    {
        return review.getAuthorandTitle(author,title);
    }
   @PutMapping("/insertdetails/bookdetails/{book_id}/{description}")
   public String  updatedescription(@PathVariable int book_id,@PathVariable String description)
   {
       return review.update(book_id,description);
   }
      @DeleteMapping("/insertdetails/{book_id}")
      public void deletebyid(@PathVariable int book_id)
      {
           review.deletebybook_id(book_id);
      }
   //pagination 
   @GetMapping ("/insertdetails/")
   public Page<Bookdetails> getpage()
   {
      return review .getpagedetail();
   }

//relationalship
 @GetMapping("/givedata")
 public List<Bookdetails> showdatas()
 {
    return review.savedata();
 }
  @PostMapping("/insertdata")
  public List<Bookdetails> gBookdetails(@RequestBody List<Bookdetails >x)
  {
    return review.insertBook(x);
  }
    
    



}
