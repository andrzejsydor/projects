package com.example.generateschema.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

@Setter
@Getter

@Entity
public class Author {

    @Id
    private Long id;

    private String name;

    @OneToMany(mappedBy = "author")
    private List<Book> books = new ArrayList<>();
}
