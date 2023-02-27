package com.example.demo.Repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Models.Book;

@Repository
public interface BookRepo extends JpaRepository<Book,Integer> {

}


