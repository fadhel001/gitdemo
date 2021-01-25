package com.fadhel.repository;

import com.fadhel.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Fadhel on 24/01/2021.
 */
public interface BookRepository extends JpaRepository <Book, Long> {
}
