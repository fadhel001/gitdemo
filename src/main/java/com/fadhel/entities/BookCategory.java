package com.fadhel.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Fadhel on 24/01/2021.
 */

@Entity
@Table(name = "books_category")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class BookCategory implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String categoryName;

    @OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL, mappedBy = "category")
    private List<Book> book = new ArrayList<>();

   }
