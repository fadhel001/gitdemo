package com.fadhel.repository;

import com.fadhel.entities.BookCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by Fadhel on 24/01/2021.
 */

@RepositoryRestResource(collectionResourceRel = "bookCategory",path = "book-category")
public interface BookCategoryRepository extends JpaRepository<BookCategory,Long>{
}
