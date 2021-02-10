package com.fadhel.repository;

import com.fadhel.entities.Book;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;


import java.util.Optional;

/**
 * Created by Fadhel on 24/01/2021.
 */
@Repository
public interface BookRepository extends JpaRepository <Book, Long> {

    @RestResource(path = "categoryid")
    Page<Book> findBookByCategory_Id (@Param("id") Long aLong, Pageable pageable);
}
