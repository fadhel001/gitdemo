package com.fadhel.repository;

import com.fadhel.entities.BookCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

/**
 * Created by Fadhel on 24/01/2021.
 */

@RepositoryRestResource(collectionResourceRel = "bookCategory",path = "book-category")
@Repository
public interface BookCategoryRepository extends JpaRepository<BookCategory,Long>{

}
