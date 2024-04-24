package com.curdoperation.operation.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.curdoperation.operation.model.Bookdetails;

import jakarta.transaction.Transactional;

public interface BookRepo extends JpaRepository<Bookdetails,Integer> {

    @Query("select u from Bookdetails u where u.author=:author and u.title=:title")
    List<Bookdetails> getauthor(String author,String title);


    @Modifying
    @Transactional
    @Query("update Bookdetails set description=:descrip where book_id=:id")
    public Integer updatedescription (String descrip ,int id);

    
    @Query("Delete from Bookdetails where id=:id")
    void deleteid(int id);

    @Query("Select s,a from Bookdetails s Left join s.reader a ")
    public  List<Bookdetails> display();

}
