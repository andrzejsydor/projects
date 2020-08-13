package com.example.generateschema.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Setter
@Getter

@Entity
public class Book {

    @Id
    private Long id;

    private String title;

    @ManyToOne
    private Author author;

    @ManyToMany
    @JoinTable(name = "book_reviever",
            joinColumns = @JoinColumn(name = "book_id"),
            inverseJoinColumns = @JoinColumn(name = "reviever_id")
    )
    private List<Reviever> revievers = new ArrayList<>();
}
