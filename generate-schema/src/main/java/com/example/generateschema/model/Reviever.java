package com.example.generateschema.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Setter
@Getter

@Entity
public class Reviever {

    @Id
    private Long id;

    private String name;

    @ManyToMany(mappedBy = "revievers")
    private List<Book> books = new ArrayList<>();
}
