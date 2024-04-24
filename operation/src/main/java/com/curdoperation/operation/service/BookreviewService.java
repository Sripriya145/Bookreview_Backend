package com.curdoperation.operation.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.curdoperation.operation.Repo.BookRepo;
import com.curdoperation.operation.model.Bookdetails;

@Service
public class BookreviewService {
    @Autowired
    BookRepo repo;
    //using controller class
    public Bookdetails insertBookdetails(Bookdetails details)
    {
        return repo.save(details);
    }
    public Optional<Bookdetails> getParticularBookDetails(int book_id)
    {
        return repo.findById(book_id);
    }
    public List<Bookdetails> GetAllBookdetails()
    {
        return repo.findAll();
    }
    public Bookdetails updateBookdetails(Bookdetails details)
    {
        return repo.save(details);
    }
    // jpql custom query
    public List<Bookdetails> getAuthorandTitle(String author,String title)
    {
        return repo.getauthor(author,title);
    }
    public String  update(int book_id,String description) 
    {
        return repo.updatedescription(description,book_id)+" update ";
    }
    public void deletebybook_id(int book_id)
    {
        repo.deleteid(book_id);
    }
    // pagination
    public Page<Bookdetails> getpagedetail()
    {
        Pageable x=PageRequest.of(1,5);
        return repo.findAll(x);

    }
    //relationalship
    public List<Bookdetails> savedata()
    {
        return repo.display();
    }
    public List<Bookdetails> insertBook(List<Bookdetails>  x)
    {
        return repo.saveAll(x);
    }
}
